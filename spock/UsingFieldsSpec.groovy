import spock.lang.Shared
import spock.lang.Specification

class UsingFieldsSpec extends Specification{

    def map = new HashMap()

    @Shared sharedMap = new HashMap()

    def "test 1"(){
        when:
        map.put("key", "value")

        then:
        assert map.size() == 1

        when:
        sharedMap.put("key", "value")

        then:
        assert sharedMap.size() == 1

    }

    def "test 2"(){
        when:
        map.put("key1", "value1")

        then:
        assert map.size() == 1

        when:
        sharedMap.put("key1", "value1")

        then:
        assert sharedMap.size() == 2
    }
}
