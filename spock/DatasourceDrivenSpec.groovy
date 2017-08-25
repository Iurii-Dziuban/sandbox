import groovy.sql.Sql
import spock.lang.Shared
import spock.lang.Specification
import spock.lang.Unroll

class DatasourceDrivenSpec extends Specification {

    def setup() {
        System.out.println("Setup of iteration")
    }

    def cleanup() {
        System.out.println("Cleanup of iteration " + iterations + ". Index is " + index)
    }

    @Shared
            iterations = 0
    def index = 0

    def "addition test with data table"() {
        iterations++
        index++

        expect:
        a + b == c

        where:
        a | b | c
        2 | 2 | 4
        3 | 6 | 9
        1 | 2 | 3
    }

    @Unroll
    def "#a + #b = #c"() {
        expect:
        a + b == c

        where:
        a | b | c
        2 | 2 | 4
        3 | 6 | 9
        1 | 2 | 3
    }

    @Unroll
    def "addition with data pipes: #a + #b = #c"() {
        expect:
        a + b == c

        where:
        a << [1, 2, 3]
        b << [4, 7, 2]
        c << [5, 9, 5]
    }

    @Shared
            sql = Sql.newInstance("jdbc:h2:mem:", "org.h2.Driver")

    def setupSpec() {
        sql.execute("create table addition (id int primary key, a int, b int, c int)")
        sql.execute("insert into addition values (1, 3, 7, 10), (2, 5, 4, 9), (3, 8, 11, 19)")
    }

    def "db as data source"() {
        expect:
        a + b == c

        where:
        [_, a, b, c] << sql.rows("select * from addition")
    }


}
