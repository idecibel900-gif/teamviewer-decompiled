package io.sentry.protocol;

import io.sentry.g1;
import io.sentry.t2;
import io.sentry.x3;
import java.io.IOException;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class DebugImage implements t2 {
    public static final String JVM = "jvm";
    public static final String PROGUARD = "proguard";
    private String arch;
    private String codeFile;
    private String codeId;
    private String debugFile;
    private String debugId;
    private String imageAddr;
    private Long imageSize;
    private String type;
    private Map<String, Object> unknown;
    private String uuid;

    public String getArch() {
        return this.arch;
    }

    public String getCodeFile() {
        return this.codeFile;
    }

    public String getCodeId() {
        return this.codeId;
    }

    public String getDebugFile() {
        return this.debugFile;
    }

    public String getDebugId() {
        return this.debugId;
    }

    public String getImageAddr() {
        return this.imageAddr;
    }

    public Long getImageSize() {
        return this.imageSize;
    }

    public String getType() {
        return this.type;
    }

    public Map<String, Object> getUnknown() {
        return this.unknown;
    }

    public String getUuid() {
        return this.uuid;
    }

    @Override // io.sentry.t2
    public void serialize(x3 x3Var, g1 g1Var) throws IOException {
        io.sentry.internal.debugmeta.c cVar = (io.sentry.internal.debugmeta.c) x3Var;
        cVar.k();
        if (this.uuid != null) {
            cVar.r("uuid");
            cVar.A(this.uuid);
        }
        if (this.type != null) {
            cVar.r("type");
            cVar.A(this.type);
        }
        if (this.debugId != null) {
            cVar.r("debug_id");
            cVar.A(this.debugId);
        }
        if (this.debugFile != null) {
            cVar.r("debug_file");
            cVar.A(this.debugFile);
        }
        if (this.codeId != null) {
            cVar.r("code_id");
            cVar.A(this.codeId);
        }
        if (this.codeFile != null) {
            cVar.r("code_file");
            cVar.A(this.codeFile);
        }
        if (this.imageAddr != null) {
            cVar.r("image_addr");
            cVar.A(this.imageAddr);
        }
        if (this.imageSize != null) {
            cVar.r("image_size");
            cVar.z(this.imageSize);
        }
        if (this.arch != null) {
            cVar.r("arch");
            cVar.A(this.arch);
        }
        Map<String, Object> map = this.unknown;
        if (map != null) {
            for (String str : map.keySet()) {
                Object obj = this.unknown.get(str);
                cVar.r(str);
                cVar.x(g1Var, obj);
            }
        }
        cVar.m();
    }

    public void setArch(String str) {
        this.arch = str;
    }

    public void setCodeFile(String str) {
        this.codeFile = str;
    }

    public void setCodeId(String str) {
        this.codeId = str;
    }

    public void setDebugFile(String str) {
        this.debugFile = str;
    }

    public void setDebugId(String str) {
        this.debugId = str;
    }

    public void setImageAddr(String str) {
        this.imageAddr = str;
    }

    public void setImageSize(long j) {
        this.imageSize = Long.valueOf(j);
    }

    public void setType(String str) {
        this.type = str;
    }

    public void setUnknown(Map<String, Object> map) {
        this.unknown = map;
    }

    public void setUuid(String str) {
        this.uuid = str;
    }

    public void setImageSize(Long l) {
        this.imageSize = l;
    }
}
