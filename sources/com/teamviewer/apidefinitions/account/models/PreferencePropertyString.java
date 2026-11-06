package com.teamviewer.apidefinitions.account.models;

import kotlin.Metadata;
import o.im3;
import o.sp3;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, d2 = {"Lcom/teamviewer/apidefinitions/account/models/PreferencePropertyString;", "", "attributes", "Lcom/teamviewer/apidefinitions/account/models/PreferenceAttributes;", "value", "", "<init>", "(Lcom/teamviewer/apidefinitions/account/models/PreferenceAttributes;Ljava/lang/String;)V", "getAttributes", "()Lcom/teamviewer/apidefinitions/account/models/PreferenceAttributes;", "getValue", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "kotlin-client_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class PreferencePropertyString {
    private final PreferenceAttributes attributes;
    private final String value;

    public PreferencePropertyString(@sp3(name = "attributes") PreferenceAttributes preferenceAttributes, @sp3(name = "value") String str) {
        preferenceAttributes.getClass();
        str.getClass();
        this.attributes = preferenceAttributes;
        this.value = str;
    }

    public static /* synthetic */ PreferencePropertyString copy$default(PreferencePropertyString preferencePropertyString, PreferenceAttributes preferenceAttributes, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            preferenceAttributes = preferencePropertyString.attributes;
        }
        if ((i & 2) != 0) {
            str = preferencePropertyString.value;
        }
        return preferencePropertyString.copy(preferenceAttributes, str);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final PreferenceAttributes getAttributes() {
        return this.attributes;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getValue() {
        return this.value;
    }

    public final PreferencePropertyString copy(@sp3(name = "attributes") PreferenceAttributes attributes, @sp3(name = "value") String value) {
        attributes.getClass();
        value.getClass();
        return new PreferencePropertyString(attributes, value);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PreferencePropertyString)) {
            return false;
        }
        PreferencePropertyString preferencePropertyString = (PreferencePropertyString) other;
        return im3.n(this.attributes, preferencePropertyString.attributes) && im3.n(this.value, preferencePropertyString.value);
    }

    public final PreferenceAttributes getAttributes() {
        return this.attributes;
    }

    public final String getValue() {
        return this.value;
    }

    public int hashCode() {
        return this.value.hashCode() + (this.attributes.hashCode() * 31);
    }

    public String toString() {
        return "PreferencePropertyString(attributes=" + this.attributes + ", value=" + this.value + ")";
    }
}
