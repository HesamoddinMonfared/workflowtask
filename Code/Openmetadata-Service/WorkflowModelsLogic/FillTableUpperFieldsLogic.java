Class FillTableUpperFieldsLogic impelments Process-Interface{

		boolean Validate(){
			if(Some Logic){
				return true;
			}
			return false;
		}
		
		boolean isUpperFieldsCompleted(){
		
			if(checkFields())
				return true;
			
			return false;
		}
}