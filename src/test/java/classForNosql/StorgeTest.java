package classForNosql;

import com.classForNosql.lifeng.Person;
import com.classForNosql.lifeng.RedisStorage;
import com.classForNosql.lifeng.RedisStorageFactory;
import com.classForNosql.lifeng.Storage;
import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;
import redis.clients.jedis.Jedis;


/**
 * Created with IntelliJ IDEA.
 * User: lifeng
 * Date: 4/26/13
 * Time: 9:48 AM
 * To change this template use File | Settings | File Templates.
 */
public class StorgeTest extends TestCase{
    public StorgeTest( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( AppTest.class );
    }

    /**
     * Rigourous Test :-)
     */
    public void testApp()
    {
        Person person=new Person();  // new Person
        person.setName("lifeng");
        person.setAge(26);

        String host="127.0.0.1"  ;   //Configure the DB parameter
        int port= 6379;

        Storage storage=new RedisStorageFactory().getStorage(host,port);  // Factory pattern  get storge instance

        storage.set("lifeng",person);
        Person personFromDB=(Person)storage.get("lifeng");
        assertTrue( "the Object person is not setted into DB correctly",personFromDB.getName().equals("lifeng"));
        assertTrue( "the Object person is not setted into DB correctly",personFromDB.getAge()==26);

    }
}
