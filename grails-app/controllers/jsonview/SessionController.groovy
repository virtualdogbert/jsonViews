package jsonview

class SessionController {

    def getSessionInfo() {
        List<Session> sessionList = Session.all
        println sessionList
        respond sessionList
    }
}
