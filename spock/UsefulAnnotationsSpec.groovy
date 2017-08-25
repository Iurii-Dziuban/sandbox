import spock.lang.Ignore
import spock.lang.IgnoreIf
import spock.lang.IgnoreRest
import spock.lang.Issue
import spock.lang.Narrative
import spock.lang.Requires
import spock.lang.See
import spock.lang.Specification
import spock.lang.Stepwise
import spock.lang.Timeout
import spock.lang.Title

@Title("Demonstration of different useful annotations")
class UsefulAnnotationsSpec extends Specification {

    @Ignore("Ignore this test for demonstration")
    def "ignored test"() {
        expect:
        2 + 2 == 4
    }

    @IgnoreRest
    def "all other tests in this spec will be ignored"() {
        expect:
        6 + 6 == 12
    }

    @IgnoreIf({ os.windows })
    def "is ignored on windows"() {
        expect:
        1 + 1 == 2
    }

    @Requires({ os.windows })
    def "is running only on windows"() {
        expect:
        2 + 3 == 5
    }

    @Timeout(5)
    def "fails after 5 seconds"() {
        Thread.sleep(6000)
        expect:
        1 + 1 == 2
    }

    @Issue("JIRA-123")
    def "test lined to jira issue"() {
        expect:
        1 + 1 == 2
    }

    @See("http://spockframework.org/spock/docs/1.1/extensions.html")
    def "test with link to smth"() {
        expect:
        1 + 1 == 2
    }

}

@Narrative("""
Tests will be executed in order of declaration.
If one test fails, the next ones will not be executed.
""")
@Stepwise
class StepwiseSpecification extends Specification {

    def "1st step"() {
        expect:
        1 + 3 == 5
    }

    def "2nd step"() {
        expect:
        1 + 3 == 4
    }
}
