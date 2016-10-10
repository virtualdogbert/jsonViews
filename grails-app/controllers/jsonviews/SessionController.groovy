package jsonviews

class SessionController {

    def getSessionInfo() {
        List<Session> sessions = Session.all
        println sessions
        respond sessions
    }
}
