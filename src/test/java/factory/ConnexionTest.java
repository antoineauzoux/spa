/**
 *
 */
package factory;

import com.cda.dao.config.IDatabaseConnection;
import com.cda.util.ContextConfigurationType;
import com.cda.util.ContextFactory;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;


import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

/**
 * @author
 *
 */

class ConnexionTest {

    private static ApplicationContext context;

//	@Before
//	public static void init() {
//		context = ContextFactory.getContext(ContextConfigurationType.CLASSPATH);
//	}

    @BeforeAll
    public static void initAll() {
        context = ContextFactory.getContext(ContextConfigurationType.CLASSPATH);
    }

    @Test
    public void connexion() {

        Connection c = context.getBean("connexionPostgres", IDatabaseConnection.class).getConnection();
        assertNotNull(c);
    }

    @Test
    public void request() {
        Integer i = null;
        try {
            Connection c = context.getBean("connexionPostgres", IDatabaseConnection.class).getConnection();
            assertNotNull(c);
            Statement s = c.createStatement();
            ResultSet r = s.executeQuery("select 1");

            while (r.next()) {
                i = r.getInt(1);
            }

        } catch (SQLException e) {

            e.printStackTrace();
        }

        assertEquals(1, i);

    }

}
