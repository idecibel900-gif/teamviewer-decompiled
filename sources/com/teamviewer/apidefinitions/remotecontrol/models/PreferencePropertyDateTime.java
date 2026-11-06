package com.teamviewer.apidefinitions.remotecontrol.models;

import java.time.OffsetDateTime;
import kotlin.Metadata;
import o.im3;
import o.sp3;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, d2 = {"Lcom/teamviewer/apidefinitions/remotecontrol/models/PreferencePropertyDateTime;", "", "attributes", "Lcom/teamviewer/apidefinitions/remotecontrol/models/PreferenceAttributes;", "value", "Ljava/time/OffsetDateTime;", "<init>", "(Lcom/teamviewer/apidefinitions/remotecontrol/models/PreferenceAttributes;Ljava/time/OffsetDateTime;)V", "getAttributes", "()Lcom/teamviewer/apidefinitions/remotecontrol/models/PreferenceAttributes;", "getValue", "()Ljava/time/OffsetDateTime;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "kotlin-client_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class PreferencePropertyDateTime {
    private final PreferenceAttributes attributes;
    private final OffsetDateTime value;

    public PreferencePropertyDateTime(@sp3(name = "attributes") PreferenceAttributes preferenceAttributes, @sp3(name = "value") OffsetDateTime offsetDateTime) {
        preferenceAttributes.getClass();
        offsetDateTime.getClass();
        this.attributes = preferenceAttributes;
        this.value = offsetDateTime;
    }

    public static /* synthetic */ PreferencePropertyDateTime copy$default(PreferencePropertyDateTime preferencePropertyDateTime, PreferenceAttributes preferenceAttributes, OffsetDateTime offsetDateTime, int i, Object obj) {
        if ((i & 1) != 0) {
            preferenceAttributes = preferencePropertyDateTime.attributes;
        }
        if ((i & 2) != 0) {
            offsetDateTime = preferencePropertyDateTime.value;
        }
        return preferencePropertyDateTime.copy(preferenceAttributes, offsetDateTime);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final PreferenceAttributes getAttributes() {
        return this.attributes;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final OffsetDateTime getValue() {
        return this.value;
    }

    public final PreferencePropertyDateTime copy(@sp3(name = "attributes") PreferenceAttributes attributes, @sp3(name = "value") OffsetDateTime value) {
        attributes.getClass();
        value.getClass();
        return new PreferencePropertyDateTime(attributes, value);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PreferencePropertyDateTime)) {
            return false;
        }
        PreferencePropertyDateTime preferencePropertyDateTime = (PreferencePropertyDateTime) other;
        return im3.n(this.attributes, preferencePropertyDateTime.attributes) && im3.n(this.value, preferencePropertyDateTime.value);
    }

    public final PreferenceAttributes getAttributes() {
        return this.attributes;
    }

    public final OffsetDateTime getValue() {
        return this.value;
    }

    public int hashCode() {
        return this.value.hashCode() + (this.attributes.hashCode() * 31);
    }

    public String toString() {
        return "PreferencePropertyDateTime(attributes=" + this.attributes + ", value=" + this.value + ")";
    }
}
