package com.teamviewer.apidefinitions.manageddevices.infrastructure;

import java.util.Arrays;
import java.util.List;
import kotlin.Metadata;
import o.lv0;
import o.qf0;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\b\u0018\u00002\u00020\u0001:\u0005\u0004\u0005\u0006\u0007\bB\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\t"}, d2 = {"Lcom/teamviewer/apidefinitions/manageddevices/infrastructure/CollectionFormats;", "", "<init>", "()V", "CSVParams", "SSVParams", "TSVParams", "PIPESParams", "SPACEParams", "kotlin-client_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class CollectionFormats {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/teamviewer/apidefinitions/manageddevices/infrastructure/CollectionFormats$SPACEParams;", "Lcom/teamviewer/apidefinitions/manageddevices/infrastructure/CollectionFormats$SSVParams;", "<init>", "()V", "kotlin-client_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class SPACEParams extends SSVParams {
        public SPACEParams() {
            super(new String[0]);
        }
    }

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0017\b\u0016\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0005\u0010\u0006B\u001d\b\u0016\u0012\u0012\u0010\u0002\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00040\u0007\"\u00020\u0004¢\u0006\u0004\b\u0005\u0010\bJ\b\u0010\t\u001a\u00020\u0004H\u0016¨\u0006\n"}, d2 = {"Lcom/teamviewer/apidefinitions/manageddevices/infrastructure/CollectionFormats$PIPESParams;", "Lcom/teamviewer/apidefinitions/manageddevices/infrastructure/CollectionFormats$CSVParams;", "params", "", "", "<init>", "(Ljava/util/List;)V", "", "([Ljava/lang/String;)V", "toString", "kotlin-client_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class PIPESParams extends CSVParams {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public PIPESParams(String... strArr) {
            super((String[]) Arrays.copyOf(strArr, strArr.length));
            strArr.getClass();
        }

        @Override // com.teamviewer.apidefinitions.manageddevices.infrastructure.CollectionFormats.CSVParams
        public String toString() {
            return lv0.t0(getParams(), "|", null, null, null, 62);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public PIPESParams(List<String> list) {
            super(list);
            list.getClass();
        }
    }

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0003\b\u0016\u0018\u00002\u00020\u0001B\u0017\b\u0016\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0005\u0010\u0006B\u001d\b\u0016\u0012\u0012\u0010\u0002\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00040\u0007\"\u00020\u0004¢\u0006\u0004\b\u0005\u0010\bJ\b\u0010\t\u001a\u00020\u0004H\u0016¨\u0006\n"}, d2 = {"Lcom/teamviewer/apidefinitions/manageddevices/infrastructure/CollectionFormats$SSVParams;", "Lcom/teamviewer/apidefinitions/manageddevices/infrastructure/CollectionFormats$CSVParams;", "params", "", "", "<init>", "(Ljava/util/List;)V", "", "([Ljava/lang/String;)V", "toString", "kotlin-client_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static class SSVParams extends CSVParams {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public SSVParams(String... strArr) {
            super((String[]) Arrays.copyOf(strArr, strArr.length));
            strArr.getClass();
        }

        @Override // com.teamviewer.apidefinitions.manageddevices.infrastructure.CollectionFormats.CSVParams
        public String toString() {
            return lv0.t0(getParams(), " ", null, null, null, 62);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public SSVParams(List<String> list) {
            super(list);
            list.getClass();
        }
    }

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0017\b\u0016\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0005\u0010\u0006B\u001d\b\u0016\u0012\u0012\u0010\u0002\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00040\u0007\"\u00020\u0004¢\u0006\u0004\b\u0005\u0010\bJ\b\u0010\t\u001a\u00020\u0004H\u0016¨\u0006\n"}, d2 = {"Lcom/teamviewer/apidefinitions/manageddevices/infrastructure/CollectionFormats$TSVParams;", "Lcom/teamviewer/apidefinitions/manageddevices/infrastructure/CollectionFormats$CSVParams;", "params", "", "", "<init>", "(Ljava/util/List;)V", "", "([Ljava/lang/String;)V", "toString", "kotlin-client_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class TSVParams extends CSVParams {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public TSVParams(String... strArr) {
            super((String[]) Arrays.copyOf(strArr, strArr.length));
            strArr.getClass();
        }

        @Override // com.teamviewer.apidefinitions.manageddevices.infrastructure.CollectionFormats.CSVParams
        public String toString() {
            return lv0.t0(getParams(), "\t", null, null, null, 62);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public TSVParams(List<String> list) {
            super(list);
            list.getClass();
        }
    }

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0006\b\u0016\u0018\u00002\u00020\u0001B\u0017\b\u0016\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0005\u0010\u0006B\u001d\b\u0016\u0012\u0012\u0010\u0002\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00040\u0007\"\u00020\u0004¢\u0006\u0004\b\u0005\u0010\bJ\b\u0010\f\u001a\u00020\u0004H\u0016R \u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\u0006¨\u0006\r"}, d2 = {"Lcom/teamviewer/apidefinitions/manageddevices/infrastructure/CollectionFormats$CSVParams;", "", "params", "", "", "<init>", "(Ljava/util/List;)V", "", "([Ljava/lang/String;)V", "getParams", "()Ljava/util/List;", "setParams", "toString", "kotlin-client_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static class CSVParams {
        private List<String> params;

        public CSVParams(String... strArr) {
            strArr.getClass();
            this.params = qf0.L(Arrays.copyOf(strArr, strArr.length));
        }

        public final List<String> getParams() {
            return this.params;
        }

        public final void setParams(List<String> list) {
            list.getClass();
            this.params = list;
        }

        public String toString() {
            return lv0.t0(this.params, ",", null, null, null, 62);
        }

        public CSVParams(List<String> list) {
            list.getClass();
            this.params = list;
        }
    }
}
