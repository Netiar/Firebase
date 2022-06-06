package com.example.firebase.models;



import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


public class country {

    @SerializedName("id")
    @Expose
    private Integer id;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("alpha2code")
    @Expose
    private String alpha2code;
    @SerializedName("alpha3code")
    @Expose
    private String alpha3code;
    @SerializedName("capital")
    @Expose
    private String capital;
    @SerializedName("flag")
    @Expose
    private String flag;
    @SerializedName("region")
    @Expose
    private String region;
    @SerializedName("subregion")
    @Expose
    private String subregion;
    @SerializedName("timezones")
    @Expose
    private List<String> timezones = null;

    /**
     * No args constructor for use in serialization
     *
     */
    public country() {
    }

    /**
     *
     * @param alpha2code
     * @param capital
     * @param alpha3code
     * @param flag
     * @param timezones
     * @param subregion
     * @param name
     * @param id
     * @param region
     */
    public country(Integer id, String name, String alpha2code, String alpha3code, String capital, String flag, String region, String subregion, List<String> timezones) {
        super();
        this.id = id;
        this.name = name;
        this.alpha2code = alpha2code;
        this.alpha3code = alpha3code;
        this.capital = capital;
        this.flag = flag;
        this.region = region;
        this.subregion = subregion;
        this.timezones = timezones;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAlpha2code() {
        return alpha2code;
    }

    public void setAlpha2code(String alpha2code) {
        this.alpha2code = alpha2code;
    }

    public String getAlpha3code() {
        return alpha3code;
    }

    public void setAlpha3code(String alpha3code) {
        this.alpha3code = alpha3code;
    }

    public String getCapital() {
        return capital;
    }

    public void setCapital(String capital) {
        this.capital = capital;
    }

    public String getFlag() {
        return flag;
    }

    public void setFlag(String flag) {
        this.flag = flag;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getSubregion() {
        return subregion;
    }

    public void setSubregion(String subregion) {
        this.subregion = subregion;
    }

    public List<String> getTimezones() {
        return timezones;
    }

    public void setTimezones(List<String> timezones) {
        this.timezones = timezones;
    }

}
