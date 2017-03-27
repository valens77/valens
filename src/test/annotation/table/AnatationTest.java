package test.annotation.table;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

public class AnatationTest {
	
	public static String getCreateTableStr(String[] classNames){
		org.springframework.transaction.config.TxNamespaceHandler a;
		org.springframework.scripting.config.LangNamespaceHandler b;
		//String[] classNames = { "test.annotation.table.Member" };
		try {
			for (String className : classNames) {
				Class cl = Class.forName(className);
				DBTable dbTable = (DBTable) cl.getAnnotation(DBTable.class);
				if (dbTable == null)
					continue;
				String tableName = dbTable.name();
				if (tableName.length() <= 0) {
					tableName = cl.getSimpleName();
				}
				List<String> columnNames = new ArrayList<String>();
				for (Field field : cl.getDeclaredFields()) {
					String columnName = "";
					Annotation[] annotations = field.getDeclaredAnnotations();
					if (annotations.length <= 0)
						continue;
					if (annotations[0] instanceof SQLInteger) {
						SQLInteger tmpSqlInt = (SQLInteger) annotations[0];
						columnName = tmpSqlInt.name();
						if (columnName.length() <= 0) {
							columnName = field.getName() + " integer";
						}
						String constrain = getConstraon(tmpSqlInt.constrain());
						columnName += constrain;
					}
					if (annotations[0] instanceof SQLString) {
						SQLString tmpSqlStr = (SQLString) annotations[0];
						columnName = tmpSqlStr.name();
						if (columnName.length() <= 0) {
							columnName = field.getName();
						}
						if (tmpSqlStr.value() > 0) {
							columnName += " varchar2(" + tmpSqlStr.value()
									+ ") ";
						}
						String constrain = getConstraon(tmpSqlStr.constrains());
						columnName += constrain;
					}
					columnNames.add(columnName);
				}
				String sqlCreat = "CREATE TABLE " + tableName + " ( \n";
				String createCommond = "";
				for (String str : columnNames) {
					createCommond += str + ",\n";
				}
				sqlCreat += createCommond + " ) ";
				//System.out.println(sqlCreat);
				return sqlCreat;
			}
		} catch (Exception e) {
			System.out.println(e);
		}
		return null;
	}
	public static void main(String[] args) {
		
		String[] classNames = { "test.annotation.table.Member" };
		
		try {
			String str=AnatationTest.getCreateTableStr(classNames);
			System.out.println(str);
		} catch (Exception e) {
			System.out.println(e);
		}

	}

	private static String getConstraon(Constrains constrain) {
		String rst = "";
		if (!constrain.allowNull()) {
			rst += " NOT NULL ";
		}
		if (constrain.primaryKey()) {
			rst += " primarykey ".toUpperCase();
		}
		if (constrain.unique()) {
			rst += " unique ".toUpperCase();
		}
		return rst;
	}
}
