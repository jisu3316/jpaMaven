<font class="papago-parent"><font class="papago-source" style="display:none;">package jpabook.</font>자북을 포장하다</font><font class="papago-parent"><font class="papago-source" style="display:none;">jpashop;
</font>jpashop;</font><font class="papago-parent"><font class="papago-source" style="display:none;">
</font>
</font><font class="papago-parent"><font class="papago-source" style="display:none;">
</font>
</font><font class="papago-parent"><font class="papago-source" style="display:none;">import jpabook.</font>자북을 수입하다</font><font class="papago-parent"><font class="papago-source" style="display:none;">jpashop.domain.</font>jpashop.domain.</font><font class="papago-parent"><font class="papago-source" style="display:none;">Book;
</font>책;</font><font class="papago-parent"><font class="papago-source" style="display:none;">import jpabook.</font>자북을 수입하다</font><font class="papago-parent"><font class="papago-source" style="display:none;">jpashop.domain.</font>jpashop.domain.</font><font class="papago-parent"><font class="papago-source" style="display:none;">Order;
</font>순서;</font><font class="papago-parent"><font class="papago-source" style="display:none;">import jpabook.</font>자북을 수입하다</font><font class="papago-parent"><font class="papago-source" style="display:none;">jpashop.domain.</font>jpashop.domain.</font><font class="papago-parent"><font class="papago-source" style="display:none;">OrderItem;</font>OrderItem;</font><font class="papago-parent"><font class="papago-source" style="display:none;">
</font>
</font><font class="papago-parent"><font class="papago-source" style="display:none;">
</font>
</font><font class="papago-parent"><font class="papago-source" style="display:none;">import javax.persistence.</font>자바스.프랜드를 수입하다</font><font class="papago-parent"><font class="papago-source" style="display:none;">EntityManager;
</font>엔티티 관리자;</font><font class="papago-parent"><font class="papago-source" style="display:none;">import javax.persistence.</font>자바스.프랜드를 수입하다</font><font class="papago-parent"><font class="papago-source" style="display:none;">EntityManagerFactory;
</font>엔티티매니저팩토리;</font><font class="papago-parent"><font class="papago-source" style="display:none;">import javax.persistence.</font>자바스.프랜드를 수입하다</font><font class="papago-parent"><font class="papago-source" style="display:none;">EntityTransaction;
</font>엔티티트트랜잭션;</font><font class="papago-parent"><font class="papago-source" style="display:none;">import javax.persistence.</font>자바스.프랜드를 수입하다</font><font class="papago-parent"><font class="papago-source" style="display:none;">Persistence;
</font>지속성;</font><font class="papago-parent"><font class="papago-source" style="display:none;">
</font>
</font><font class="papago-parent"><font class="papago-source" style="display:none;">public class JpaMain {
</font>공용 클래스 JpaMain {</font><font class="papago-parent"><font class="papago-source" style="display:none;">    public static void main(String[] args) {
</font>공용 정적 보이드 주(String[] args) {</font><font class="papago-parent"><font class="papago-source" style="display:none;">        EntityManagerFactory emf = Persistence.createEntityManagerFactory("hello");</font>EntityManagerFactory emf = 지속성.createEntityManagerFactory("Hello");</font><font class="papago-parent"><font class="papago-source" style="display:none;">
</font>
</font><font class="papago-parent"><font class="papago-source" style="display:none;">
</font>
</font><font class="papago-parent"><font class="papago-source" style="display:none;">        EntityManager em = emf.createEntityManager();//database 커넥션 하나 받았다 생각하면됨.</font>엔티티매니저 em = emf.createEntityManager(;//database 커넥션션 하하하나 하다나 생다하다 면하하하면면면면면면면면면면.</font><font class="papago-parent"><font class="papago-source" style="display:none;">
</font>
</font><font class="papago-parent"><font class="papago-source" style="display:none;">
</font>
</font><font class="papago-parent"><font class="papago-source" style="display:none;">        EntityTransaction tx = em.getTransaction();
</font>EntityTransaction tx = em.getTransaction();</font><font class="papago-parent"><font class="papago-source" style="display:none;">        tx.begin();
</font>tx.csv();</font><font class="papago-parent"><font class="papago-source" style="display:none;">
</font>
</font><font class="papago-parent"><font class="papago-source" style="display:none;">        try {
</font>{을 시험해 보다.</font><font class="papago-parent"><font class="papago-source" style="display:none;">
</font>
</font><font class="papago-parent"><font class="papago-source" style="display:none;">            Book book = new Book();
</font>책 = 새 책();</font><font class="papago-parent"><font class="papago-source" style="display:none;">            book.</font>책</font><font class="papago-parent"><font class="papago-source" style="display:none;">setName("JPA");
</font>setName("JPA");</font><font class="papago-parent"><font class="papago-source" style="display:none;">            book.</font>책</font><font class="papago-parent"><font class="papago-source" style="display:none;">setAuthor("김영한");</font>setAuthor("김영한");</font><font class="papago-parent"><font class="papago-source" style="display:none;">
</font>
</font><font class="papago-parent"><font class="papago-source" style="display:none;">            em.persist(book);</font>em.csv(책);</font><font class="papago-parent"><font class="papago-source" style="display:none;">
</font>
</font><font class="papago-parent"><font class="papago-source" style="display:none;">
</font>
</font><font class="papago-parent"><font class="papago-source" style="display:none;">            tx.commit();
</font>tx.commit();</font><font class="papago-parent"><font class="papago-source" style="display:none;">        } catch (Exception e) {
</font>} 캐치(예외 e) {</font><font class="papago-parent"><font class="papago-source" style="display:none;">            tx.rollback();
</font>tx.csv();</font><font class="papago-parent"><font class="papago-source" style="display:none;">        } finally {
</font>} 마침내 {</font><font class="papago-parent"><font class="papago-source" style="display:none;">            em.close();
</font>em.close();</font><font class="papago-parent"><font class="papago-source" style="display:none;">        }
</font>}</font><font class="papago-parent"><font class="papago-source" style="display:none;">
</font>
</font><font class="papago-parent"><font class="papago-source" style="display:none;">        emf.close();
</font>emf.close();</font><font class="papago-parent"><font class="papago-source" style="display:none;">
</font>
</font><font class="papago-parent"><font class="papago-source" style="display:none;">    }
</font>}</font><font class="papago-parent"><font class="papago-source" style="display:none;">}
</font>}</font> 
