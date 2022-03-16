package com.africastalking.voice;


import com.google.gson.Gson;
import java.util.List;

public final class CallResponse {
    public List<CallEntry> entries;
    public String errorMessage;

    @Override
    public String toString() {
        return new Gson().toJson(this);
    }
}
