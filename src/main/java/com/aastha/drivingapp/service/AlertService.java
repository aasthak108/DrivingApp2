package com.aastha.drivingapp.service;

import com.aastha.drivingapp.model.Alert;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class AlertService {
    List<Alert> alertList = new ArrayList<Alert>();

    public void save(Alert alert) {
        boolean isOverSpeeding = getFromRuleEngine(alert);
        alert.setOverSpeeding(isOverSpeeding);
        alertList.add(alert);
    }

    public Alert getAlertById(int alertId) {
        Alert alert = null;
        if(alertList != null && alertList.size()>0){
            for(Alert o : alertList)
            {
                if(o.getAlertId() == alertId){
                    alert = o;
                    break;
                }
            }
        }
        return alert;
    }

    private boolean getFromRuleEngine(Alert alert)
    {
        // highway, residential, commercial, city_center
        boolean isOverSpeeding = false;
        if(alert.getLocationType().equalsIgnoreCase("highway") && alert.getSpeed() > 80)
        {
            isOverSpeeding = true;
        }
        else if(alert.getLocationType().equalsIgnoreCase("residential") && alert.getSpeed() > 60)
        {
            isOverSpeeding = true;
        }
        else if(alert.getLocationType().equalsIgnoreCase("commercial") && alert.getSpeed() > 40)
        {
            isOverSpeeding = true;
        }
        else if(alert.getLocationType().equalsIgnoreCase("city_center") && alert.getSpeed() > 30)
        {
            isOverSpeeding = true;
        }
        return isOverSpeeding;
    }
}
