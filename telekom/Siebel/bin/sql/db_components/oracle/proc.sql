
--------------------------------------------------------
--  DDL for Procedure UPDATE_ORDER_STATE
--------------------------------------------------------
set define off;

  CREATE OR REPLACE PROCEDURE "UPDATE_ORDER_STATE" 
(
  porder_id IN VARCHAR2,  
  pstate IN VARCHAR2
) AS 
BEGIN
  UPDATE dcspp_order te
  SET te.state = pstate
  WHERE te.order_id = porder_id;
END UPDATE_ORDER_STATE;

/
