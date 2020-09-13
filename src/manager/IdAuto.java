package manager;

	public class IdAuto {
		public static void main(String[] args) {
			String beforeId = null;
			String prefix = "H";
			int uperUnit = 1;
			int length = 8;
			String charCode = "0";
			String newId1 = generateStudentID(beforeId, prefix, uperUnit, length, charCode);
			String newId2 = generateStudentID(newId1, prefix, uperUnit, length, charCode);
			System.out.println(newId1);
			System.out.println(newId2);
		}

		private static String generateStudentID(String beforeId, String prefix, int uperUnit, int length, String charCode) {
			
			StringBuilder result = new StringBuilder(prefix);
			int id = 1;
			if (beforeId != null) {
				id = id + uperUnit;
			}
			int totalCharSpace = length - String.valueOf(id).length() - prefix.length();
			for (int i = 0; i < totalCharSpace; i++) {
				result.append(charCode);
			}
			result.append(id);
			return result.toString();
		}
	}