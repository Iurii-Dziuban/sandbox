import spock.lang.Specification

class BddStyleSpec extends Specification {

    def "bdd style test"() {
        given: "a file was initialized"
        def file = new File("test.txt");
        and: "a new file was created"
        file.createNewFile()

        when: "a string is written to file"
        file.write("abc")
        and: "we read from file"
        def fileLines = file.readLines()

        then: "file has one line"
        fileLines.size() == 1
        and: "this line has correct content"
        fileLines[0] == "abc"

        cleanup:
        file.delete()
    }

}
