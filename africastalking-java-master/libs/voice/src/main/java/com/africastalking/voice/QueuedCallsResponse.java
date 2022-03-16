package com.africastalking.voice;


import com.google.gson.Gson;

import java.util.List;

public final class QueuedCallsResponse {
    public String status;
    public String errorMessage;
    public List<CallEntry> entries;

    @Override
    public String toString() {
        return new Gson().toJson(this);
    }
}
