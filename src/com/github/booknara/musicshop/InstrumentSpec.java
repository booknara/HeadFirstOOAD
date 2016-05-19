package com.github.booknara.musicshop;

import java.util.HashMap;
import java.util.Map;

/**
 * @author : Daehee Han(@daniel_booknara) on 5/10/16.
 */
public class InstrumentSpec {
    private Map<String, Object> properties;

    public InstrumentSpec(Map<String, Object> properties) {
        if (properties == null)
            this.properties = new HashMap<>();
        else 
            this.properties = new HashMap<>(properties);
    }

    public Map<String, Object> getProperties() {
        return properties;
    }

    public String getProperty(String key) {
        return properties.get(key).toString();
    }
    
    public boolean matches(InstrumentSpec otherSpec) {
        for (String propertyName : otherSpec.getProperties().keySet()) {
            if(!properties.get(propertyName).toString().equals(otherSpec.getProperty(propertyName)))
                return false;
        }

        return true;
    }
}
