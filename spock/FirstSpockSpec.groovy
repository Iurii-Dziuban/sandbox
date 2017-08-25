import spock.lang.Specification

class FirstSpockSpec extends Specification {

    def "dummy example with adding elements to list"() {
        setup:
        def myList = []

        when:
        myList.add("a")
        myList.add("b")

        then:
        myList.size() == 2
        myList == ["a", "b"]
    }

    def exampleOfUsingExpect() {
        given:
        def str = "abc"

        expect:
        str.size() == 3
    }


    def "using with example"() {
        when:
        def str = "abc"

        then:
        with(str) {
            length() == 3
            charAt(0) == "a"
        }
    }

    def "using setup and cleanup"() {
        setup:
        def file = new File("test.txt")
        file.createNewFile()

        when:
        file.write("abc")

        then:
        assert file.readLines()[0].length() == 3

        cleanup:
        file.delete()
    }
}
