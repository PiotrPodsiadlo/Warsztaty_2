package example1.model;

import java.time.LocalDateTime;

public class Solution {

    private int id;
    private LocalDateTime created;
    private LocalDateTime updated;
    private String description;
    private int exerciseId;
    private int usersId;

    public Solution(LocalDateTime created, String description, int exerciseId, int usersId) {
        this.created = created;
        this.description = description;
        this.exerciseId = exerciseId;
        this.usersId = usersId;
    }

    public Solution() {
        created = LocalDateTime.now();
    }

    public int getId() {
        return id;
    }

    public Solution setId(int id) {
        this.id = id;
        return this;
    }

    public LocalDateTime getCreated() {
        return created;
    }

    public Solution setCreated(LocalDateTime created) {
        this.created = created;
        return this;
    }

    public LocalDateTime getUpdated() {
        return updated;
    }

    public Solution setUpdated(LocalDateTime updated) {
        this.updated = updated;
        return this;
    }

    public String getDescription() {
        return description;
    }

    public Solution setDescription(String description) {
        this.description = description;
        return this;
    }

    public int getExerciseId() {
        return exerciseId;
    }

    public Solution setExerciseId(int exerciseId) {
        this.exerciseId = exerciseId;
        return this;
    }

    public int getUsersId() {
        return usersId;
    }

    public Solution setUsersId(int usersId) {
        this.usersId = usersId;
        return this;
    }

    @Override
    public String toString() {
        return "Solution{" +
                "id=" + id +
                ", created=" + created +
                ", updated=" + updated +
                ", description='" + description + '\'' +
                ", exerciseId=" + exerciseId +
                ", usersId=" + usersId +
                '}';
    }
}
