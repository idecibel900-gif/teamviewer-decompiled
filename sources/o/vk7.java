package o;

/* JADX INFO: loaded from: classes.dex */
public final class vk7 {
    public final int a;

    public vk7(int i) {
        this.a = (i & 1) != 0 ? Integer.MAX_VALUE : 1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof vk7) && this.a == ((vk7) obj).a && Float.compare(1.0f, 1.0f) == 0;
    }

    public final int hashCode() {
        return Boolean.hashCode(false) + to7.f(e41.e(1.0f, Integer.hashCode(this.a) * 31, 31), 31, false);
    }

    public final String toString() {
        return fx3.f(this.a, "TVLottieCompositionData(iterations=", ", speed=1.0, reverseOnRepeat=false, restartOnPlay=false)");
    }
}
