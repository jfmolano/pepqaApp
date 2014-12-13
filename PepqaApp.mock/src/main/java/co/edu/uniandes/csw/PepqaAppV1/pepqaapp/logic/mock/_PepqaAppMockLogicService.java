/* ========================================================================
 * Copyright 2014 PepqaAppV1
 *
 * Licensed under the MIT, The MIT License (MIT)
 * Copyright (c) 2014 PepqaAppV1

Permission is hereby granted, free of charge, to any person obtaining a copy
of this software and associated documentation files (the "Software"), to deal
in the Software without restriction, including without limitation the rights
to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
copies of the Software, and to permit persons to whom the Software is
furnished to do so, subject to the following conditions:

The above copyright notice and this permission notice shall be included in
all copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
THE SOFTWARE.
 * ========================================================================


Source generated by CrudMaker version 1.0.0.201411201032

*/

package co.edu.uniandes.csw.PepqaAppV1.pepqaapp.logic.mock;
import java.util.ArrayList;
import java.util.List;

import co.edu.uniandes.csw.PepqaAppV1.pepqaapp.logic.dto.PepqaAppDTO;
import co.edu.uniandes.csw.PepqaAppV1.pepqaapp.logic.dto.PepqaAppPageDTO;
import co.edu.uniandes.csw.PepqaAppV1.pepqaapp.logic.api._IPepqaAppLogicService;

public abstract class _PepqaAppMockLogicService implements _IPepqaAppLogicService {

	private Long id= new Long(1);
	protected List<PepqaAppDTO> data=new ArrayList<PepqaAppDTO>();

	public PepqaAppDTO createPepqaApp(PepqaAppDTO pepqaApp){
		id++;
		pepqaApp.setId(id);
		data.add(pepqaApp);
		return pepqaApp;
    }
    
    public List<PepqaAppDTO> getPepqaApps(){
		return data; 
	}

	public PepqaAppPageDTO getPepqaApps(Integer page, Integer maxRecords){
		PepqaAppPageDTO response = new PepqaAppPageDTO();
		response.setTotalRecords(Long.parseLong(data.size()+""));
		response.setRecords(data);
		return response;
	}

	public PepqaAppDTO getPepqaApp(Long id){
		for(PepqaAppDTO data1:data){
			if(data1.getId().equals(id)){
				return data1;
			}
		}
		return null;
	}

	public void deletePepqaApp(Long id){
	    PepqaAppDTO delete=null;
		for(PepqaAppDTO data1:data){
			if(data1.getId().equals(id)){
				delete=data1;
			}
		}
		if(delete!=null){
			data.remove(delete);
		} 
	}

	public void updatePepqaApp(PepqaAppDTO pepqaApp){
	    PepqaAppDTO delete=null;
		for(PepqaAppDTO data1:data){
			if(data1.getId().equals(pepqaApp.getId())){
				delete=data1;
			}
		}
		if(delete!=null){
			data.remove(delete);
			data.add(pepqaApp);
		} 
	}	
}