import org.junit.Assert;
import org.junit.Test;
import org.springframework.test.util.ReflectionTestUtils;
import spaceshuttle.demo.model.Course;

/**
 * Created by Zoe on 29/11/17.
 */
public class ModelsTest {
    @Test
    public void testCourseModel() {
        //mutable
        StringBuffer stringBuffer = new StringBuffer("");
        stringBuffer.append("asf");
        Course course = new Course("JEE fullstack", "JEE fullstack course for Melbourne");
        String name = (String) ReflectionTestUtils.getField(course, "name");
        name = "JavaScript";
//Immutable
        String userFriendlyDescription = "Course name is " + course.getName() + ", description is " + course.getDescription();
        String temp = userFriendlyDescription;
        userFriendlyDescription = "new one";
        Assert.assertNotEquals(temp, userFriendlyDescription);
    }
}
