using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Net;
using System.Net.Sockets;
using System.Threading;
using Calc;


namespace Server {
    public class ClientObject {
        public TcpClient client;
        public ClientObject(TcpClient tcpClient) {
            client = tcpClient;
        }
        public void Process() {
            NetworkStream stream = null;
            try {
                stream = client.GetStream();
                var data = new byte[255];
                while (true) {
                    var builder = new StringBuilder();
                    do {
                       var bytes = stream.Read(data, 0, data.Length);
                       builder.Append(Encoding.Unicode.GetString(data, 0, bytes));
                    }
                    while (stream.DataAvailable);
                    var message = builder.ToString();
                    Console.WriteLine(message);
                    message = Calculator.Calculation(message).ToString();
                    message = message.Substring(message.IndexOf(':') + 1).Trim();
                    data = Encoding.Unicode.GetBytes(message);
                    stream.Write(data, 0, data.Length);
                }
            }
            catch (Exception ex) {
                Console.WriteLine(ex.Message);
            }
            finally {
                if (stream != null)
                    stream.Close();
                if (client != null)
                    client.Close();
            }
        }
    }

    class Program {
        const int port = 8888;
        const string address = "127.0.0.1";
        static TcpListener listener;
        static void Main(string[] args) {
            try {
                listener = new TcpListener(IPAddress.Parse(address), port);
                listener.Start();
                Console.WriteLine("Ожидание подключений...");
                while (true) {
                    var client = listener.AcceptTcpClient();
                    var clientObject = new ClientObject(client);
                    var clientThread = new Thread(clientObject.Process);
                    clientThread.Start();
                }
            }
            catch (Exception ex) {
                Console.WriteLine(ex.Message);
            }
            finally {
                if (listener != null)
                    listener.Stop();
            }
        }
    }
}
