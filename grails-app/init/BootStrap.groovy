import jsonviews.Project
import jsonviews.Session
import jsonviews.User

class BootStrap {

    def init = { servletContext ->
        User u = new User(username: 'testUser').save(flush:true, failOnError:true)
        Project p = new Project(name: 'testProject').save(flush:true, failOnError:true)
        Session s = new Session(name: 'testSession1', project:p, creator: u, startDate: new Date()).save(flush:true, failOnError:true)
        s = new Session(name: 'testSession2', project:p, creator: u, startDate: new Date()).save(flush:true, failOnError:true)

    }
    def destroy = {
    }
}
