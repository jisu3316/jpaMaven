<font class="papago-parent"><font class="papago-source" style="display:none;">package jpabook.</font>자북을 포장하다</font><font class="papago-parent"><font class="papago-source" style="display:none;">jpashop.domain;
</font>jpashop.domain;</font><font class="papago-parent"><font class="papago-source" style="display:none;">
</font>
</font><font class="papago-parent"><font class="papago-source" style="display:none;">import javax.persistence.</font>자바스.프랜드를 수입하다</font><font class="papago-parent"><font class="papago-source" style="display:none;">MappedSuperclass;
</font>MappedSuperclass;</font><font class="papago-parent"><font class="papago-source" style="display:none;">import java.time.</font>java.time을 가져오다</font><font class="papago-parent"><font class="papago-source" style="display:none;">LocalDateTime;
</font>LocalDateTime; </font><font class="papago-parent"><font class="papago-source" style="display:none;">
</font>
</font><font class="papago-parent"><font class="papago-source" style="display:none;">@MappedSuperclass
</font>@MappedSuperclass</font><font class="papago-parent"><font class="papago-source" style="display:none;">public class BaseEntity {
</font>공용 클래스 BaseEntity {</font><font class="papago-parent"><font class="papago-source" style="display:none;">
</font>
</font><font class="papago-parent"><font class="papago-source" style="display:none;">    private String createdBy;</font>작성자별 문자열</font><font class="papago-parent"><font class="papago-source" style="display:none;">
</font>
</font><font class="papago-parent"><font class="papago-source" style="display:none;">    private LocalDateTime createdDate;
</font>개인 LocalDateTime createdDate;</font><font class="papago-parent"><font class="papago-source" style="display:none;">    private String lastModifiedBy;
</font>개인 문자열 lastModifiedBy;</font><font class="papago-parent"><font class="papago-source" style="display:none;">    private LocalDateTime lastModifiedDate;
</font>개인 LocalDateTime lastModifiedDate;</font><font class="papago-parent"><font class="papago-source" style="display:none;">
</font>
</font><font class="papago-parent"><font class="papago-source" style="display:none;">    public String getCreatedBy() {
</font>공용 문자열 getCreatedBy() {</font><font class="papago-parent"><font class="papago-source" style="display:none;">        return createdBy;</font>생성자 반환;</font><font class="papago-parent"><font class="papago-source" style="display:none;">
</font>
</font><font class="papago-parent"><font class="papago-source" style="display:none;">    }
</font>}</font><font class="papago-parent"><font class="papago-source" style="display:none;">
</font>
</font><font class="papago-parent"><font class="papago-source" style="display:none;">    public void setCreatedBy(String createdBy) {
</font>공용 void setCreatedBy(String CreatedBy) {</font><font class="papago-parent"><font class="papago-source" style="display:none;">        this.createdBy = createdBy;</font>this.createdBy = createdBy;</font><font class="papago-parent"><font class="papago-source" style="display:none;">
</font>
</font><font class="papago-parent"><font class="papago-source" style="display:none;">    }
</font>}</font><font class="papago-parent"><font class="papago-source" style="display:none;">
</font>
</font><font class="papago-parent"><font class="papago-source" style="display:none;">    public LocalDateTime getCreatedDate() {
</font>공용 LocalDateTime getCreatedDate() {</font><font class="papago-parent"><font class="papago-source" style="display:none;">        return createdDate;
</font>만든 날짜 반환;</font><font class="papago-parent"><font class="papago-source" style="display:none;">    }
</font>}</font><font class="papago-parent"><font class="papago-source" style="display:none;">
</font>
</font><font class="papago-parent"><font class="papago-source" style="display:none;">    public void setCreatedDate(LocalDateTime createdDate) {
</font>공용 void setCreatedDate(LocalDateTime createdDate) {</font><font class="papago-parent"><font class="papago-source" style="display:none;">        this.createdDate = createdDate;
</font>this.createdDate = createdDate;</font><font class="papago-parent"><font class="papago-source" style="display:none;">    }
</font>}</font><font class="papago-parent"><font class="papago-source" style="display:none;">
</font>
</font><font class="papago-parent"><font class="papago-source" style="display:none;">    public String getLastModifiedBy() {
</font>공용 문자열 getLastModifiedBy() {</font><font class="papago-parent"><font class="papago-source" style="display:none;">        return lastModifiedBy;
</font>lastModifiedBy 반환;</font><font class="papago-parent"><font class="papago-source" style="display:none;">    }
</font>}</font><font class="papago-parent"><font class="papago-source" style="display:none;">
</font>
</font><font class="papago-parent"><font class="papago-source" style="display:none;">    public void setLastModifiedBy(String lastModifiedBy) {
</font>공용 void setLastModifiedBy(String lastModifiedBy) {</font><font class="papago-parent"><font class="papago-source" style="display:none;">        this.lastModifiedBy = lastModifiedBy;
</font>this.ModifiedBy = lastModifiedBy;</font><font class="papago-parent"><font class="papago-source" style="display:none;">    }
</font>}</font><font class="papago-parent"><font class="papago-source" style="display:none;">
</font>
</font><font class="papago-parent"><font class="papago-source" style="display:none;">    public LocalDateTime getLastModifiedDate() {
</font>공용 LocalDateTime getLastModifiedDate() {</font><font class="papago-parent"><font class="papago-source" style="display:none;">        return lastModifiedDate;
</font>lastModifiedDate 반환;</font><font class="papago-parent"><font class="papago-source" style="display:none;">    }
</font>}</font><font class="papago-parent"><font class="papago-source" style="display:none;">
</font>
</font><font class="papago-parent"><font class="papago-source" style="display:none;">    public void setLastModifiedDate(LocalDateTime lastModifiedDate) {
</font>공용 void setLastModifiedDate(LocalDateTime lastModifiedDate) {</font><font class="papago-parent"><font class="papago-source" style="display:none;">        this.lastModifiedDate = lastModifiedDate;
</font>this.ModifiedDate = lastModifiedDate;</font><font class="papago-parent"><font class="papago-source" style="display:none;">    }
</font>}</font><font class="papago-parent"><font class="papago-source" style="display:none;">}
</font>}</font>
