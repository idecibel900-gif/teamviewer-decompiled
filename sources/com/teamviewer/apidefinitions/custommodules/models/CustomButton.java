package com.teamviewer.apidefinitions.custommodules.models;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import o.e41;
import o.im3;
import o.sp3;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B5\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003J7\u0010\u0012\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\nR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\n¨\u0006\u0019"}, d2 = {"Lcom/teamviewer/apidefinitions/custommodules/models/CustomButton;", "", "normalColor", "", "hoverColor", "pressedColor", "labelColor", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getNormalColor", "()Ljava/lang/String;", "getHoverColor", "getPressedColor", "getLabelColor", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "kotlin-client_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class CustomButton {
    private final String hoverColor;
    private final String labelColor;
    private final String normalColor;
    private final String pressedColor;

    public /* synthetic */ CustomButton(String str, String str2, String str3, String str4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4);
    }

    public static /* synthetic */ CustomButton copy$default(CustomButton customButton, String str, String str2, String str3, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = customButton.normalColor;
        }
        if ((i & 2) != 0) {
            str2 = customButton.hoverColor;
        }
        if ((i & 4) != 0) {
            str3 = customButton.pressedColor;
        }
        if ((i & 8) != 0) {
            str4 = customButton.labelColor;
        }
        return customButton.copy(str, str2, str3, str4);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getNormalColor() {
        return this.normalColor;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getHoverColor() {
        return this.hoverColor;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getPressedColor() {
        return this.pressedColor;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getLabelColor() {
        return this.labelColor;
    }

    public final CustomButton copy(@sp3(name = "normalColor") String normalColor, @sp3(name = "hoverColor") String hoverColor, @sp3(name = "pressedColor") String pressedColor, @sp3(name = "labelColor") String labelColor) {
        normalColor.getClass();
        return new CustomButton(normalColor, hoverColor, pressedColor, labelColor);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CustomButton)) {
            return false;
        }
        CustomButton customButton = (CustomButton) other;
        return im3.n(this.normalColor, customButton.normalColor) && im3.n(this.hoverColor, customButton.hoverColor) && im3.n(this.pressedColor, customButton.pressedColor) && im3.n(this.labelColor, customButton.labelColor);
    }

    public final String getHoverColor() {
        return this.hoverColor;
    }

    public final String getLabelColor() {
        return this.labelColor;
    }

    public final String getNormalColor() {
        return this.normalColor;
    }

    public final String getPressedColor() {
        return this.pressedColor;
    }

    public int hashCode() {
        int iHashCode = this.normalColor.hashCode() * 31;
        String str = this.hoverColor;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.pressedColor;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.labelColor;
        return iHashCode3 + (str3 != null ? str3.hashCode() : 0);
    }

    public String toString() {
        String str = this.normalColor;
        String str2 = this.hoverColor;
        return e41.m(e41.o("CustomButton(normalColor=", str, ", hoverColor=", str2, ", pressedColor="), this.pressedColor, ", labelColor=", this.labelColor, ")");
    }

    public CustomButton(@sp3(name = "normalColor") String str, @sp3(name = "hoverColor") String str2, @sp3(name = "pressedColor") String str3, @sp3(name = "labelColor") String str4) {
        str.getClass();
        this.normalColor = str;
        this.hoverColor = str2;
        this.pressedColor = str3;
        this.labelColor = str4;
    }
}
