package vn.iotstar.entity;

import java.io.Serializable;

import jakarta.persistence.*;

@Entity
@Table(name="Favorites")
public class Favorite implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="FavoriteId")
    private Long favoriteId;

    @ManyToOne
    @JoinColumn(name="VideoId")
    private Video video;

    @Column(name="UserId")
    private String userId;

    // Các thuộc tính khác của Favorite nếu cần
    @Column(name="LikedDate")
    private java.util.Date likedDate;

    public Favorite() {
    }

    // Getters và Setters
    public Long getFavoriteId() {
        return favoriteId;
    }

    public void setFavoriteId(Long favoriteId) {
        this.favoriteId = favoriteId;
    }

    public Video getVideo() {
        return video;
    }

    public void setVideo(Video video) {
        this.video = video;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public java.util.Date getLikedDate() {
        return likedDate;
    }

    public void setLikedDate(java.util.Date likedDate) {
        this.likedDate = likedDate;
    }
}
