package o;

import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class it5 {
    public final String a;
    public final String b;
    public final String c;
    public final int d;

    public it5(JSONObject jSONObject) {
        this.c = jSONObject.optString("billingPeriod");
        this.b = jSONObject.optString("priceCurrencyCode");
        this.a = jSONObject.optString("formattedPrice");
        jSONObject.optLong("priceAmountMicros");
        jSONObject.optInt("recurrenceMode");
        this.d = jSONObject.optInt("billingCycleCount");
    }
}
