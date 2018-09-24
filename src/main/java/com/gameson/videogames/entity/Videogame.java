package com.gameson.videogames.entity;

import javax.persistence.*;

@Entity
@Table(name="videogame")
public class Videogame {

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private int idVideogame;

        private String video_name;
        private String platform;
        private String category;

    public Videogame() {
    }

    public Videogame(int idVideogame, String video_name, String platform, String category) {
        this.idVideogame = idVideogame;
        this.video_name = video_name;
        this.platform = platform;
        this.category = category;
    }

    public int getIdVideogame() {
        return idVideogame;
    }

    public void setIdVideogame(int idVideogame) {
        this.idVideogame = idVideogame;
    }

    public String getVideo_name() {
        return video_name;
    }

    public void setVideo_name(String video_name) {
        this.video_name = video_name;
    }

    public String getPlatform() {
        return platform;
    }

    public void setPlatform(String platform) {
        this.platform = platform;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    @Override
    public String toString() {
        return "Videogame{" +
                "idVideogame=" + idVideogame +
                ", video_name='" + video_name + '\'' +
                ", platform='" + platform + '\'' +
                ", category='" + category + '\'' +
                '}';
    }
}
