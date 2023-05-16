public class City implements  Comparable<City>{
    private  int code ;
    private String name;
    private String region;
    private int population;
    private  int foundation;

    public City(int code, String name, String region, int population, int foundation) {
        this.code = code;
        this.name = name;
        this.region = region;
        this.population = population;
        this.foundation = foundation;
    }

    public City() {
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public int getPopulation() {
        return population;
    }

    public void setPopulation(int population) {
        this.population = population;
    }

    public int getFoundation() {
        return foundation;
    }

    public void setFoundation(int foundation) {
        this.foundation = foundation;
    }

    @Override
    public String toString() {
        return "City{" +
                "code=" + code +
                ", name='" + name + '\'' +
                ", region='" + region + '\'' +
                ", population=" + population +
                ", foundation=" + foundation +
                '}';
    }

    @Override
    public int compareTo(City o) {
        return code - o.getCode();
    }
}
