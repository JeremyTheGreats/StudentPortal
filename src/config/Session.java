package config;

public class Session {
    
    private static Session instance;

    // Fields matching your tbl_user database columns
    private int id;
    private String fullname;
    private String email;
    private String role;
    private String status;
    private String ImagePath;

    // Private constructor ensures no other class can create a new Session object
    private Session() {
    }
    
    // Method to get the single existing instance of this class
    public static Session getInstance() {
        if (instance == null) {
            instance = new Session();
        }
        return instance;
    }

    // --- Getters and Setters ---

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getImagePath() {
        return ImagePath;
    }

    public void setImagePath(String ImagePath) {
        this.ImagePath = ImagePath;
    }
    
    // Method to clear the session data upon logout
    public static void destroy() {
        instance = null;
    }
}