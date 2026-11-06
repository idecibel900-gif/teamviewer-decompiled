package com.teamviewer.apidefinitions.policies.models;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import o.e41;
import o.im3;
import o.sp3;
import o.un1;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0015\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B7\u0012\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u0001\u0012\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÆ\u0003J\u0010\u0010\u0017\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\u0012J>\u0010\u0018\u001a\u00020\u00002\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u00012\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÆ\u0001¢\u0006\u0002\u0010\u0019J\u0013\u0010\u001a\u001a\u00020\u00072\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001c\u001a\u00020\u001dHÖ\u0001J\t\u0010\u001e\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u001e\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000bR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0001¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\n\n\u0002\u0010\u0013\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u001f"}, d2 = {"Lcom/teamviewer/apidefinitions/policies/models/Settings;", "", "key", "", "value", "valueAsJson", "enforce", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Boolean;)V", "getKey", "()Ljava/lang/String;", "getValue$annotations", "()V", "getValue", "getValueAsJson", "()Ljava/lang/Object;", "getEnforce", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "component1", "component2", "component3", "component4", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Boolean;)Lcom/teamviewer/apidefinitions/policies/models/Settings;", "equals", "other", "hashCode", "", "toString", "kotlin-client_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class Settings {
    private final Boolean enforce;
    private final String key;
    private final String value;
    private final Object valueAsJson;

    public /* synthetic */ Settings(String str, String str2, Object obj, Boolean bool, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : obj, (i & 8) != 0 ? null : bool);
    }

    public static /* synthetic */ Settings copy$default(Settings settings, String str, String str2, Object obj, Boolean bool, int i, Object obj2) {
        if ((i & 1) != 0) {
            str = settings.key;
        }
        if ((i & 2) != 0) {
            str2 = settings.value;
        }
        if ((i & 4) != 0) {
            obj = settings.valueAsJson;
        }
        if ((i & 8) != 0) {
            bool = settings.enforce;
        }
        return settings.copy(str, str2, obj, bool);
    }

    @un1
    public static /* synthetic */ void getValue$annotations() {
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getKey() {
        return this.key;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getValue() {
        return this.value;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final Object getValueAsJson() {
        return this.valueAsJson;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final Boolean getEnforce() {
        return this.enforce;
    }

    public final Settings copy(@sp3(name = "key") String key, @sp3(name = "value") String value, @sp3(name = "valueAsJson") Object valueAsJson, @sp3(name = "enforce") Boolean enforce) {
        return new Settings(key, value, valueAsJson, enforce);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Settings)) {
            return false;
        }
        Settings settings = (Settings) other;
        return im3.n(this.key, settings.key) && im3.n(this.value, settings.value) && im3.n(this.valueAsJson, settings.valueAsJson) && im3.n(this.enforce, settings.enforce);
    }

    public final Boolean getEnforce() {
        return this.enforce;
    }

    public final String getKey() {
        return this.key;
    }

    public final String getValue() {
        return this.value;
    }

    public final Object getValueAsJson() {
        return this.valueAsJson;
    }

    public int hashCode() {
        String str = this.key;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.value;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Object obj = this.valueAsJson;
        int iHashCode3 = (iHashCode2 + (obj == null ? 0 : obj.hashCode())) * 31;
        Boolean bool = this.enforce;
        return iHashCode3 + (bool != null ? bool.hashCode() : 0);
    }

    public String toString() {
        String str = this.key;
        String str2 = this.value;
        Object obj = this.valueAsJson;
        Boolean bool = this.enforce;
        StringBuilder sbO = e41.o("Settings(key=", str, ", value=", str2, ", valueAsJson=");
        sbO.append(obj);
        sbO.append(", enforce=");
        sbO.append(bool);
        sbO.append(")");
        return sbO.toString();
    }

    public Settings(@sp3(name = "key") String str, @sp3(name = "value") String str2, @sp3(name = "valueAsJson") Object obj, @sp3(name = "enforce") Boolean bool) {
        this.key = str;
        this.value = str2;
        this.valueAsJson = obj;
        this.enforce = bool;
    }

    public Settings() {
        this(null, null, null, null, 15, null);
    }
}
