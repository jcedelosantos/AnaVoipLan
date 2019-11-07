package com.example.icg_dominicana.anavoip.Models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.math.BigDecimal;

public class MainReport {
    @SerializedName("scan_work")
    @Expose
    private Boolean scan_work;
    @SerializedName("received_packet")
    @Expose
    private Integer received_packet;
    @SerializedName("successful_hack")
    @Expose
    private Boolean successful_hack;
    @SerializedName("sip_packet")
    @Expose
    private Integer sip_packet;
    @SerializedName("dhcp_leasing_work")
    @Expose
    private Boolean dhcp_leasing_work;
    @SerializedName("extension_found")
    @Expose
    private Integer extension_found;
    @SerializedName("rtp_packet")
    @Expose
    private Integer rtp_packet;
    @SerializedName("local_dhcp_found")
    @Expose
    private Boolean local_dhcp_found;
    @SerializedName("plain_arp_poison_work")
    @Expose
    private Boolean plain_arp_poison_work;
    @SerializedName("hacking_time")
    @Expose
    private BigDecimal hacking_time;
    @SerializedName("local_pbx_found")
    @Expose
    private Boolean local_pbx_found;
    @SerializedName("sip_phone_found")
    @Expose
    private Integer sip_phone_found;
    @SerializedName("main_report_id")
    @Expose
    private Integer main_report_id;
    @SerializedName("id")
    @Expose
    private Integer id;

    public MainReport(Boolean scan_work, Integer received_packet, Boolean successful_hack, Integer sip_packet, Boolean dhcp_leasing_work, Integer extension_found, Integer rtp_packet, Boolean local_dhcp_found, Boolean plain_arp_poison_work, BigDecimal hacking_time, Boolean local_pbx_found, Integer sip_phone_found, Integer main_report_id, Integer id) {

        this.scan_work = scan_work;
        this.received_packet = received_packet;
        this.successful_hack = successful_hack;
        this.sip_packet = sip_packet;
        this.dhcp_leasing_work = dhcp_leasing_work;
        this.extension_found = extension_found;
        this.rtp_packet = rtp_packet;
        this.local_dhcp_found = local_dhcp_found;
        this.plain_arp_poison_work = plain_arp_poison_work;
        this.hacking_time = hacking_time;
        this.local_pbx_found = local_pbx_found;
        this.sip_phone_found = sip_phone_found;
        this.main_report_id = main_report_id;
        this.id = id;
    }





    public Boolean getScan_work() {
        return scan_work;
    }

    public void setScan_work(Boolean scan_work) {
        this.scan_work = scan_work;
    }

    public Integer getReceived_packet() {
        return received_packet;
    }

    public void setReceived_packet(Integer received_packet) {
        this.received_packet = received_packet;
    }

    public Boolean getSuccessful_hack() {
        return successful_hack;
    }

    public void setSuccessful_hack(Boolean successful_hack) {
        this.successful_hack = successful_hack;
    }

    public Integer getSip_packet() {
        return sip_packet;
    }

    public void setSip_packet(Integer sip_packet) {
        this.sip_packet = sip_packet;
    }

    public Boolean getDhcp_leasing_work() {
        return dhcp_leasing_work;
    }

    public void setDhcp_leasing_work(Boolean dhcp_leasing_work) {
        this.dhcp_leasing_work = dhcp_leasing_work;
    }

    public Integer getExtension_found() {
        return extension_found;
    }

    public void setExtension_found(Integer extension_found) {
        this.extension_found = extension_found;
    }

    public Integer getRtp_packet() {
        return rtp_packet;
    }

    public void setRtp_packet(Integer rtp_packet) {
        this.rtp_packet = rtp_packet;
    }

    public Boolean getLocal_dhcp_found() {
        return local_dhcp_found;
    }

    public void setLocal_dhcp_found(Boolean local_dhcp_found) {
        this.local_dhcp_found = local_dhcp_found;
    }

    public Boolean getPlain_arp_poison_work() {
        return plain_arp_poison_work;
    }

    public void setPlain_arp_poison_work(Boolean plain_arp_poison_work) {
        this.plain_arp_poison_work = plain_arp_poison_work;
    }

    public BigDecimal getHacking_time() {
        return hacking_time;
    }

    public void setHacking_time(BigDecimal hacking_time) {
        this.hacking_time = hacking_time;
    }

    public Boolean getLocal_pbx_found() {
        return local_pbx_found;
    }

    public void setLocal_pbx_found(Boolean local_pbx_found) {
        this.local_pbx_found = local_pbx_found;
    }

    public Integer getSip_phone_found() {
        return sip_phone_found;
    }

    public void setSip_phone_found(Integer sip_phone_found) {
        this.sip_phone_found = sip_phone_found;
    }

    public Integer getMain_report_id() {
        return main_report_id;
    }

    public void setMain_report_id(Integer main_report_id) {
        this.main_report_id = main_report_id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }


}
