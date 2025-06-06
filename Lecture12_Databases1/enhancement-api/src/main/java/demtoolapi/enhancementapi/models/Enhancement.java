package demtoolapi.enhancementapi.models;

public class Enhancement {
    private Long id;
    private String name;
    private String description;
    private String type;
    private String manufacturer;

    public Enhancement(Long id, String name, String description, String type, String manufacturer) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.type = type;
        this.manufacturer = manufacturer;
    }

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getDescription() { return description; }
    public void setDescription(String description) { this.description = description; }

    public String getType() { return type; }
    public void setType(String type) { this.type = type; }

    public String getManufacturer() { return manufacturer; }
    public void setManufacturer(String manufacturer) { this.manufacturer = manufacturer; }
}
