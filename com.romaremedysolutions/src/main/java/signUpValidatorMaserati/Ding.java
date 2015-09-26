package signUpValidatorMaserati;

import org.apache.xmlbeans.impl.store.Public2;


public class Ding {

	public static void main(String[] args) {
		System.out.println("Ding is alive! RR");
		
		
		Object remedyArrayObject[] = new Object[] {"gama", "melpensa", "safas", "afssaf" };
		
		Object hotDogSushiEater[][] = new Object[][] { { "asdas", "asd"}, {"TC-01.003","TC-01.003"}, {"TC-01.003","zooooom"}, {"TC-01.003","zoom"}  };
		

		
		
		for (int i = 0; i <4; i++ ){
		System.out.println(remedyArrayObject[i]);
		System.out.print(hotDogSushiEater[i][0]);
		System.out.println(hotDogSushiEater[i][1]);
		}
		
		System.out.println(hotDogSushiEater);
		
		
		String remedyOneDimentionalArray[] = {"esrer", "sdfdsf"};
		System.out.println(remedyOneDimentionalArray[0]);
		
		
		
		
		
		String puding[] = new String[3];
		
		puding[0] = "zoola";
		puding[1] = "samba";
		puding[2] = "workit";
		System.out.println(puding[0] + puding[1] + puding[2]);
		
				
		
		
		
		
		
		String pathOfMetadaExcelFile = "RemedyMetadata/RemedySignUpMetadata.xlsx";
		RemedyExcelObject actualRemedyExcelObject = new RemedyExcelObject(pathOfMetadaExcelFile);
		String zinzana[] = new String[3];
		zinzana[0] = actualRemedyExcelObject.metaDataWorkbookRemedy.getSheet("Testing Metadata Updated").getRow(2).getCell(1).getStringCellValue();
		zinzana[1] = actualRemedyExcelObject.metaDataWorkbookRemedy.getSheet("Testing Metadata Updated").getRow(2).getCell(3).getStringCellValue();
		zinzana[2] = actualRemedyExcelObject.metaDataWorkbookRemedy.getSheet("Testing Metadata Updated").getRow(2).getCell(4).getStringCellValue();
		System.out.println(zinzana[0] + zinzana[1] + zinzana[2]);

		
		
		
		String pathOfMetadaExcelFile2 = "RemedyMetadata/RemedySignUpMetadata.xlsx";
		RemedyExcelObject actualRemedyExcelObject2 = new RemedyExcelObject(pathOfMetadaExcelFile2);
		String seaShell[][] = new String[2][3];
		seaShell[0][0] = actualRemedyExcelObject2.metaDataWorkbookRemedy.getSheet("Testing Metadata Updated").getRow(2).getCell(1).getStringCellValue();
		seaShell[0][1] = actualRemedyExcelObject2.metaDataWorkbookRemedy.getSheet("Testing Metadata Updated").getRow(2).getCell(3).getStringCellValue();
		seaShell[0][2] = actualRemedyExcelObject2.metaDataWorkbookRemedy.getSheet("Testing Metadata Updated").getRow(2).getCell(4).getStringCellValue();
		System.out.println(seaShell[0][0] + seaShell[0][1] + seaShell[0][2]);

		
		
		System.out.println("\r\n\r\n");
		
		
		
		String pathOfMetadaExcelFile3 = "RemedyMetadata/RemedySignUpMetadata.xlsx";
		RemedyExcelObject actualRemedyExcelObject3 = new RemedyExcelObject(pathOfMetadaExcelFile3);
		String magicalMystery[][] = new String[2][3];
		magicalMystery[0][0] = actualRemedyExcelObject3.metaDataWorkbookRemedy.getSheet("Testing Metadata Updated").getRow(2).getCell(1).getStringCellValue();
		magicalMystery[0][1] = actualRemedyExcelObject3.metaDataWorkbookRemedy.getSheet("Testing Metadata Updated").getRow(2).getCell(3).getStringCellValue();
		magicalMystery[0][2] = actualRemedyExcelObject3.metaDataWorkbookRemedy.getSheet("Testing Metadata Updated").getRow(2).getCell(4).getStringCellValue();
		
		magicalMystery[1][0] = actualRemedyExcelObject3.metaDataWorkbookRemedy.getSheet("Testing Metadata Updated").getRow(3).getCell(1).getStringCellValue();
		magicalMystery[1][1] = actualRemedyExcelObject3.metaDataWorkbookRemedy.getSheet("Testing Metadata Updated").getRow(3).getCell(3).getStringCellValue();
		magicalMystery[1][2] = actualRemedyExcelObject3.metaDataWorkbookRemedy.getSheet("Testing Metadata Updated").getRow(3).getCell(4).getStringCellValue();
		
		System.out.println(magicalMystery[0][0] + magicalMystery[0][1] + magicalMystery[0][2]);
		System.out.println(magicalMystery[1][0] + magicalMystery[1][1] + magicalMystery[1][2]);


		
		
		
		
		String pathOfMetadaExcelFile4 = "RemedyMetadata/RemedySignUpMetadata.xlsx";
		RemedyExcelObject actualRemedyExcelObject4 = new RemedyExcelObject(pathOfMetadaExcelFile4);
		String hamburgers[][] = new String[2][3];
		
		for (int i = 0; i <2; i++) {
		hamburgers[i][0] = actualRemedyExcelObject4.metaDataWorkbookRemedy.getSheet("Testing Metadata Updated").getRow(i).getCell(1).getStringCellValue();
		hamburgers[i][1] = actualRemedyExcelObject4.metaDataWorkbookRemedy.getSheet("Testing Metadata Updated").getRow(i).getCell(3).getStringCellValue();
		hamburgers[i][2] = actualRemedyExcelObject4.metaDataWorkbookRemedy.getSheet("Testing Metadata Updated").getRow(i).getCell(4).getStringCellValue();
		}
		
		System.out.println(hamburgers[0][0] + hamburgers[0][1] + hamburgers[0][2]);
		System.out.println(hamburgers[1][0] + hamburgers[1][1] + hamburgers[1][2]);

		
		
		
		

		System.out.println("\r\n\r\n");
		
		
		
		
		
		
		String pathOfMetadaExcelFile5 = "RemedyMetadata/RemedySignUpMetadata.xlsx";
		RemedyExcelObject actualRemedyExcelObject5 = new RemedyExcelObject(pathOfMetadaExcelFile5);
		
		int howManyRowsInExcelObject = actualRemedyExcelObject5.metaDataWorkbookRemedy.getSheet("NewDataaaa").getLastRowNum();
		
		
		
		String italianFood[][] = new String[howManyRowsInExcelObject][4];
		
		for (int q = 0; q <howManyRowsInExcelObject; q++) {
		italianFood[q][0] = actualRemedyExcelObject5.metaDataWorkbookRemedy.getSheet("NewDataaaa").getRow(q).getCell(1).getStringCellValue();
		italianFood[q][1] = actualRemedyExcelObject5.metaDataWorkbookRemedy.getSheet("NewDataaaa").getRow(q).getCell(2).getStringCellValue();
		italianFood[q][2] = actualRemedyExcelObject5.metaDataWorkbookRemedy.getSheet("NewDataaaa").getRow(q).getCell(3).getStringCellValue();
		italianFood[q][3] = actualRemedyExcelObject5.metaDataWorkbookRemedy.getSheet("NewDataaaa").getRow(q).getCell(4).getStringCellValue();
		}

		for (int i=0; i<howManyRowsInExcelObject; i++) {
		System.out.println(italianFood[i][0] + italianFood[i][1] + italianFood[i][2] + italianFood[i][3]);
		}
		
		
		
		
		
		String pathOfMetadaExcelFile6 = "RemedyMetadata/RemedySignUpMetadata.xlsx";
		RemedyExcelObject actualRemedyExcelObject6 = new RemedyExcelObject(pathOfMetadaExcelFile6);
		
		int howManyRowsInExcelObject2 = actualRemedyExcelObject6.metaDataWorkbookRemedy.getSheet("NewDataaaa").getLastRowNum();
		
		String santorini[][] = new String[howManyRowsInExcelObject2][2];
		
		for (int eee = 0; eee <howManyRowsInExcelObject2; eee++) {
		santorini[eee][0] = actualRemedyExcelObject6.metaDataWorkbookRemedy.getSheet("NewDataaaa").getRow(eee).getCell(1).getStringCellValue();
		santorini[eee][1] = actualRemedyExcelObject6.metaDataWorkbookRemedy.getSheet("NewDataaaa").getRow(eee).getCell(2).getStringCellValue();
		}

		for (int i=0; i<howManyRowsInExcelObject2; i++) {
		System.out.println(santorini[i][0] + santorini[i][1]);
		}
		
		
		}
		


}
