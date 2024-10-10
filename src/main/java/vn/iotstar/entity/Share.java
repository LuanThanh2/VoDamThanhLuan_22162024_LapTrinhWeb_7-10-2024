package vn.iotstar.entity;

import java.io.Serializable;
import java.util.Date;

import jakarta.persistence.*;

@Entity
@Table(name="Shares")
public class Share implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="ShareId")
    private Long shareId;

    @Column(name="Email")
    private String email;

    @Column(name="SharedDate")
    private Date sharedDate;

    // bi-directional many-to-one association to Video
    @ManyToOne
    @JoinColumn(name="VideoId")
    private Video video;

    public Share() {
    }

    // Getters và Setters
    public Long getShareId() {
        return shareId;
    }

    public void setShareId(Long shareId) {
        this.shareId = shareId;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getSharedDate() {
        return sharedDate;
    }

    public void setSharedDate(Date sharedDate) {
        this.sharedDate = sharedDate;
    }

    public Video getVideo() {
        return video;
    }

    public void setVideo(Video video) {
        this.video = video;
    }
}
