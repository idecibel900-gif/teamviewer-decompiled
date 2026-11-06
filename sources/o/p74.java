package o;

/* JADX INFO: loaded from: classes.dex */
public final class p74 {
    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof p74);
    }

    public final int hashCode() {
        return Boolean.hashCode(false) + to7.f(to7.f(to7.f(Boolean.hashCode(true) * 31, 31, true), 31, false), 31, true);
    }

    public final String toString() {
        return "LibraryBadges(version=true, author=true, description=false, license=true, funding=false)";
    }
}
