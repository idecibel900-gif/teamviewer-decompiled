package com.google.android.gms.auth.api.signin;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.ReflectedParcelable;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import o.et1;
import o.nv1;
import o.q2;
import o.xf5;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
@Deprecated
public class GoogleSignInAccount extends q2 implements ReflectedParcelable {
    public static final Parcelable.Creator<GoogleSignInAccount> CREATOR = new xf5((byte) 20);
    public final String m;
    public final String n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final String f33o;
    public final String p;
    public final Uri q;
    public String r;
    public final long s;
    public final String t;
    public final List u;
    public final String v;
    public final String w;
    public final HashSet x = new HashSet();

    public GoogleSignInAccount(String str, String str2, String str3, String str4, Uri uri, String str5, long j, String str6, ArrayList arrayList, String str7, String str8) {
        this.m = str;
        this.n = str2;
        this.f33o = str3;
        this.p = str4;
        this.q = uri;
        this.r = str5;
        this.s = j;
        this.t = str6;
        this.u = arrayList;
        this.v = str7;
        this.w = str8;
    }

    public static GoogleSignInAccount c(String str) throws JSONException {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        JSONObject jSONObject = new JSONObject(str);
        String strOptString = jSONObject.optString("photoUrl");
        Uri uri = !TextUtils.isEmpty(strOptString) ? Uri.parse(strOptString) : null;
        long j = Long.parseLong(jSONObject.getString("expirationTime"));
        HashSet hashSet = new HashSet();
        JSONArray jSONArray = jSONObject.getJSONArray("grantedScopes");
        int length = jSONArray.length();
        for (int i = 0; i < length; i++) {
            hashSet.add(new Scope(1, jSONArray.getString(i)));
        }
        String strOptString2 = jSONObject.optString("id");
        String strOptString3 = jSONObject.has("tokenId") ? jSONObject.optString("tokenId") : null;
        String strOptString4 = jSONObject.has("email") ? jSONObject.optString("email") : null;
        String strOptString5 = jSONObject.has("displayName") ? jSONObject.optString("displayName") : null;
        String strOptString6 = jSONObject.has("givenName") ? jSONObject.optString("givenName") : null;
        String strOptString7 = jSONObject.has("familyName") ? jSONObject.optString("familyName") : null;
        String string = jSONObject.getString("obfuscatedIdentifier");
        nv1.q(string);
        GoogleSignInAccount googleSignInAccount = new GoogleSignInAccount(strOptString2, strOptString3, strOptString4, strOptString5, uri, null, j, string, new ArrayList(hashSet), strOptString6, strOptString7);
        googleSignInAccount.r = jSONObject.has("serverAuthCode") ? jSONObject.optString("serverAuthCode") : null;
        return googleSignInAccount;
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof GoogleSignInAccount)) {
            return false;
        }
        GoogleSignInAccount googleSignInAccount = (GoogleSignInAccount) obj;
        if (!googleSignInAccount.t.equals(this.t)) {
            return false;
        }
        HashSet hashSet = new HashSet(googleSignInAccount.u);
        hashSet.addAll(googleSignInAccount.x);
        HashSet hashSet2 = new HashSet(this.u);
        hashSet2.addAll(this.x);
        return hashSet.equals(hashSet2);
    }

    public final int hashCode() {
        int iHashCode = this.t.hashCode() + 527;
        HashSet hashSet = new HashSet(this.u);
        hashSet.addAll(this.x);
        return (iHashCode * 31) + hashSet.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iB0 = et1.b0(parcel, 20293);
        et1.X(parcel, 2, this.m);
        et1.X(parcel, 3, this.n);
        et1.X(parcel, 4, this.f33o);
        et1.X(parcel, 5, this.p);
        et1.W(parcel, 6, this.q, i);
        et1.X(parcel, 7, this.r);
        et1.a0(parcel, 8, 8);
        parcel.writeLong(this.s);
        et1.X(parcel, 9, this.t);
        et1.Z(parcel, 10, this.u);
        et1.X(parcel, 11, this.v);
        et1.X(parcel, 12, this.w);
        et1.c0(parcel, iB0);
    }
}
