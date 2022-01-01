package fa.training.problem02.service.impl;

import fa.training.problem02.dao.WorkingHistoryDAO;
import fa.training.problem02.dao.impl.WorkingHistoryDAOImpl;
import fa.training.problem02.entities.WorkingHistory;
import fa.training.problem02.service.IWorkingHistorySerivce;

public class WorkingHistoryServiceImpl implements IWorkingHistorySerivce<WorkingHistory> {
    @Override
    public void create(WorkingHistory workingHistory) {
        WorkingHistoryDAO workingHistoryDAO = new WorkingHistoryDAOImpl();
        workingHistoryDAO.save(workingHistory);
    }
}