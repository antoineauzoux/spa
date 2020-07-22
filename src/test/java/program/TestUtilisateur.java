package program;

import com.cda.bean.Utilisateur;
import com.cda.dao.IUtilisateurDao;
import com.cda.util.ContextConfigurationType;
import com.cda.util.ContextFactory;
import org.junit.Assert;
import org.junit.FixMethodOrder;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.runners.MethodSorters;
import org.springframework.context.ApplicationContext;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
class TestUtilisateur {

    private static IUtilisateurDao utilisateurDao;

    @BeforeAll
    public static void initAll() {
        ApplicationContext context = ContextFactory.getContext(ContextConfigurationType.CLASSPATH);
        utilisateurDao = context.getBean(IUtilisateurDao.class);
    }

    @Test
    public void a() {
        utilisateurDao.create(new Utilisateur("john", "malkovich", "jm@gmail.com"));
        utilisateurDao.create(new Utilisateur("bobo", "leclown", "bobo@gmail.com"));
        Assert.assertEquals(2, utilisateurDao.selectAll().size());
    }

    @Test
    public void b() {
        List<Utilisateur> list = utilisateurDao.selectAll();
        assertNotNull(list);
        assertNotEquals(0,list.size());
        assertNotNull(list.get(0));
    }

    @Test
    public void c() {
        List<Utilisateur> list = utilisateurDao.selectAll();

        Utilisateur user1 = list.get(0);
        Utilisateur user2 = utilisateurDao.findById(user1.getId());

        Assert.assertNotNull(user2);
    }

    @Test
    public void d() {
        List<Utilisateur> list = utilisateurDao.selectAll();
        Utilisateur user1 = list.get(0);
        utilisateurDao.update(user1);
        Assert.assertNotNull(user1);
    }

    @Test
    public void e() {
        utilisateurDao.deleteById(utilisateurDao.findById(1));
        Assert.assertEquals(1L, utilisateurDao.selectAll().size());
    }
}