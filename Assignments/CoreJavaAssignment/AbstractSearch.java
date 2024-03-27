package corejavaAss;
	public abstract class AbstractSearch {
		public abstract boolean search(Object [] obj_list, Object obj);
	}
	//instaceof-reference variable contains a given type of object reference or not
	class IntegerSearch extends AbstractSearch {
	    @Override
	    public boolean search(Object[] obj_list, Object obj) {
	        if (!(obj instanceof Integer)) {
	            return false;
	        }
	 
	        Integer target = (Integer) obj;
	 
	        for (Object item : obj_list) {
	            if (item instanceof Integer) {
	                Integer value = (Integer) item;
	                if (value.equals(target)) {
	                    return true;
	                }
	            }
	        }
	 
	        return false;
	    }
	}
	 
	class StringSearch extends AbstractSearch {
	    @Override
	    public boolean search(Object[] obj_list, Object obj) {
	        if (!(obj instanceof String)) {
	            return false;
	        }
	 
	        String target = (String) obj;
	 
	        for (Object item : obj_list) {
	            if (item instanceof String) {
	                String value = (String) item;
	                if (value.equals(target)) {
	                    return true;
	                }
	            }
	        }
	 
	        return false;
	    }
	}

