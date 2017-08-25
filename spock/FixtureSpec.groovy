import spock.lang.Specification

class FixtureSpec extends Specification {

    def setupSpec() {
        System.out.println("setup spec in parent")
    }

    def setup() {
        System.out.println("setup in parent")
    }

    def "test 1 in parent"() {
        expect:
        System.out.println("test1 in parent")
    }

    def "test 2 in parent"() {
        expect:
        System.out.println("test2 in parent")
    }


    def cleanup() {
        System.out.println("cleanup in parent")
    }

    def cleanupSpec() {
        System.out.println("cleanup spec in parent")
    }

}

class FixtureChildSpec extends FixtureSpec {
    def setupSpec() {
        System.out.println("setup spec in child")
    }

    def setup() {
        System.out.println("setup in child")
    }

    def "test in child"() {
        expect:
        System.out.println("test in child")
    }

    def cleanup() {
        System.out.println("cleanup in child")
    }

    def cleanupSpec() {
        System.out.println("cleanup spec in child")
    }
}
