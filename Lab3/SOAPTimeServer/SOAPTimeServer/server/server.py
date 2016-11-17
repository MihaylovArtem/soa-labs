from spyne import Application
from spyne.protocol.soap import Soap11

from spyne.server.wsgi import WsgiApplication

from time_service import TimeService

application = Application(
    [TimeService],
    tns='ru.susu.time',
    in_protocol=Soap11(validator='lxml'),
    out_protocol=Soap11()
)

if __name__ == '__main__':
    print("oh yeah")
    from wsgiref.simple_server import make_server
    wsgi_app = WsgiApplication(application)
    server = make_server('0.0.0.0', 8000, wsgi_app)
    server.serve_forever()


