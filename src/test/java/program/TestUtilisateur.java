package program;

import com.cda.bean.Utilisateur;
import com.cda.dao.IUtilisateurDao;
import com.cda.util.ContextConfigurationType;
import com.cda.util.ContextFactory;
import org.junit.Assert;
import org.junit.jupiter.api.*;
import org.springframework.context.ApplicationContext;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
class TestUtilisateur {

    private static IUtilisateurDao utilisateurDao;

    @BeforeAll
    public static void initAll() {
        ApplicationContext context = ContextFactory.getContext(ContextConfigurationType.CLASSPATH);
        utilisateurDao = context.getBean(IUtilisateurDao.class);
    }

    @Test
    @Order(0)
    public void testViderTable() {
        utilisateurDao.deleteAll();
        Assert.assertEquals(0, utilisateurDao.selectAll().size());
    }

    @Test
    @Order(1)
    public void testCreate() {
        utilisateurDao.create(new Utilisateur("john", "malkovich", "jm@gmail.com"));
        utilisateurDao.create(new Utilisateur("bobo", "leclown", "bobo@gmail.com"));
        Assert.assertEquals(2, utilisateurDao.selectAll().size());
    }

    @Test
    @Order(2)
    public void testSelectAll() {
        List<Utilisateur> list = utilisateurDao.selectAll();
        assertNotNull(list);
        assertNotEquals(0, list.size());
        assertNotNull(list.get(0));
    }

    @Test
    @Order(3)
    public void testFindById() {
        List<Utilisateur> list = utilisateurDao.selectAll();

        Utilisateur user1 = list.get(0);
        Utilisateur user2 = utilisateurDao.findById(user1.getId());

        Assert.assertNotNull(user2);
    }

    @Test
    @Order(4)
    public void testUpdate() {
        List<Utilisateur> list = utilisateurDao.selectAll();
        Utilisateur user1 = list.get(0);
        utilisateurDao.update(user1);
        Assert.assertNotNull(user1);
    }

    @Test
    @Order(5)
    public void testDelete() {
        utilisateurDao.deleteById(utilisateurDao.findById(1));
        Assert.assertEquals(1L, utilisateurDao.selectAll().size());
    }
}