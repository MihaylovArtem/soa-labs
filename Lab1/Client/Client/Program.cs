using System;
using System.Text;
using System.Net.Sockets;
using Calc;

namespace Client {
    class Program {
        const int port = 8888;
        const string address = "127.0.0.1";
        static void Main() {
            while (true) {
                try {
                    var client = new TcpClient(address, port);
                    var stream = client.GetStream();
                    Console.Write("Client: ");
                    var message = Console.ReadLine();
                    var data = Encoding.Unicode.GetBytes(Calculator.GetMessage(message));
                    stream.Write(data, 0, data.Length);
                    data = new byte[255];
                    var builder = new StringBuilder();
                    do {
                        var bytes = stream.Read(data, 0, data.Length);
                        builder.Append(Encoding.Unicode.GetString(data, 0, bytes));
                    }
                    while (stream.DataAvailable);
                    message = builder.ToString();
                    Console.WriteLine("Сервер: " + message);
                }
                catch (Exception ex) {
                    Console.WriteLine(ex.Message);
                }
            }
        }
    }
}
