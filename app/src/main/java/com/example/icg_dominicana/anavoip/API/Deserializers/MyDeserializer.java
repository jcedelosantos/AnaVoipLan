package com.example.icg_dominicana.anavoip.API.Deserializers;

import com.example.icg_dominicana.anavoip.Fragments.Reports;
import com.example.icg_dominicana.anavoip.Models.MainReport;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonParseException;

import java.lang.reflect.Type;
import java.math.BigDecimal;

public class MyDeserializer implements JsonDeserializer {
    @Override

    public MainReport deserialize(JsonElement json, Type typeOfT, JsonDeserializationContext context) throws JsonParseException {

        Boolean scan_work =  json.getAsJsonObject().get("scan_work").getAsBoolean();
        Integer received_packet =  json.getAsJsonObject().get("received_packet").getAsInt();
        Boolean successful_hack =  json.getAsJsonObject().get("successful_hack").getAsBoolean();
        Integer sip_packet =  json.getAsJsonObject().get("sip_packet").getAsInt();
        Boolean dhcp_leasing_work = json.getAsJsonObject().get("dhcp_leasing_work").getAsBoolean();
        Integer extension_found = json.getAsJsonObject().get("extension_found").getAsInt();
        Integer rtp_packet = json.getAsJsonObject().get("rtp_packet").getAsInt();
        Boolean local_dhcp_found =  json.getAsJsonObject().get("local_dhcp_found").getAsBoolean();
        Boolean plain_arp_poison_work =  json.getAsJsonObject().get("plain_arp_poison_work").getAsBoolean();
        BigDecimal hacking_time =  json.getAsJsonObject().get("hacking_time").getAsBigDecimal();
        Boolean local_pbx_found =  json.getAsJsonObject().get("local_pbx_found").getAsBoolean();
        Integer sip_phone_found = json.getAsJsonObject().get("sip_phone_found").getAsInt();
        Integer main_report_id = json.getAsJsonObject().get("main_report_id").getAsInt();
        Integer id = json.getAsJsonObject().get("id").getAsInt();


        MainReport mainreport = new MainReport( scan_work,received_packet, successful_hack,sip_packet,dhcp_leasing_work,extension_found,rtp_packet,local_dhcp_found,plain_arp_poison_work,hacking_time,local_pbx_found,sip_phone_found,main_report_id,id);
        return mainreport;
    }
}
