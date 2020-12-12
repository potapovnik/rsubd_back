package rsubd.services;

import org.springframework.stereotype.Service;
import rsubd.DAO.CheckDao;

@Service
public class CheckService {
    private final CheckDao checkDao;

    public CheckService(CheckDao checkDao) {
        this.checkDao = checkDao;
    }
    public boolean checkForEmployee(Long idDivision){
        if (checkDao.checkDivision(idDivision).size()!=0){
            return true;
        }
        return false;
    }
    public boolean[] checkForStage(Long idEmployee,Long idTask,Long idNameStage){
        boolean emplTaskStage[] = new boolean[3];
        if (checkDao.checkEmployee(idEmployee).size()!=0){
            emplTaskStage[0] = true;
        }
        if (checkDao.checkTask(idTask).size() !=0){
            emplTaskStage[1]=true;
        }
        if (checkDao.checkNameStage(idNameStage).size() !=0){
            emplTaskStage[2]=true;
        }
        return emplTaskStage;
    }
    public boolean[] employeeAndStage(Long idEployee,Long idStage){
        boolean check[] = new boolean[2];
        if (checkDao.checkEmployee(idEployee).size()!=0){
            check[0] = true;
        }
        if (checkDao.checkStage(idStage).size() !=0){
            check[1] = true;
        }
        return check;
    }
}
