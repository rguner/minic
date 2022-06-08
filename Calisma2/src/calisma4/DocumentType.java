public class DocumentType {

	public static void main(String[] args) {

		DocumentTypeEnum dt1 = DocumentTypeEnum.WORD;
		System.out.println(dt1.getValue());
		System.out.println(dt1);
		System.out.println(dt1.key());
		DocumentTypeEnum dt2 = DocumentTypeEnum.HTML;
		System.out.println(dt2.getValue());

		DocumentType2Enum dt3 = DocumentType2Enum.PDF;
		System.out.println(dt3.getValue());

		DocumentType3Enum dt4 = DocumentType3Enum.PDF;
		System.out.println(dt4.getValue());

	}

	public enum DocumentTypeEnum {
		WORD(1), PDF(2), HTML(3);

		private final int value;

		private DocumentTypeEnum(int value) {
			this.value = value;
		}

		public int getValue() {
			return value;
		}

		public static DocumentTypeEnum parse(int value) {
			// DocumentType.values() metodu değer kümesini döndürür
			for (DocumentTypeEnum type : DocumentTypeEnum.values()) {
				if (value == type.getValue()) {
					return type;
				}
			}
			return PDF;
		}

		public String key() {
			return getClass().getSimpleName() + "." + this.toString();
		}

		/*
		 * @Override public String toString() { StringBuilder builder = new StringBuilder(); builder.append("DocumentTypeEnum[value=" + value);
		 * builder.append("]"); return builder.toString(); }
		 */
	}

	public enum DocumentType2Enum {
		WORD("doc"), PDF("pdf"), HTML("html");

		private final String value;

		private DocumentType2Enum(String value) {
			this.value = value;
		}

		public String getValue() {
			return value;
		}

		public static DocumentType2Enum parse(String value) {
			// DocumentType.values() metodu değer kümesini döndürür
			for (DocumentType2Enum type : DocumentType2Enum.values()) {
				if (value.equals(type.getValue())) {
					return type;
				}
			}
			return PDF;
		}
		/*
		 * @Override public String toString() { StringBuilder builder = new StringBuilder(); builder.append("DocumentTypeEnum[value=" + value);
		 * builder.append("]"); return builder.toString(); }
		 */
	}

	public enum DocumentType3Enum {
		WORD("doccc", 1), PDF("pdffff", 2), HTML("htmlll", 3);

		private final String value;
		private final int intValue;

		private DocumentType3Enum(String value, int intValue) {
			this.value = value;
			this.intValue = intValue;
		}

		public String getValue() {
			return value;
		}

		public static DocumentType3Enum parse(String value) {
			// DocumentType.values() metodu değer kümesini döndürür
			for (DocumentType3Enum type : DocumentType3Enum.values()) {
				if (value.equals(type.getValue())) {
					return type;
				}
			}
			return PDF;
		}
		/*
		 * @Override public String toString() { StringBuilder builder = new StringBuilder(); builder.append("DocumentTypeEnum[value=" + value);
		 * builder.append("]"); return builder.toString(); }
		 */
	}

}
