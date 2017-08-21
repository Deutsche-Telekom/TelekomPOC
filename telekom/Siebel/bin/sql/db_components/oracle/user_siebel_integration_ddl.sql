alter table DPS_USER modify (
  login varchar2(40) null
);

alter table DCS_ORG_ADDRESS modify (
  tag varchar2(100) null
);

alter table DPS_USER add (
  siebel_id varchar2(32),
  siebel_account_id varchar2(32)
);

alter table DPS_ORGANIZATION add (
  siebel_id varchar2(32),
  location varchar2(80),
  phone_number varchar2(30),
  default_carrier varchar2(30)
);

alter table DPS_CONTACT_INFO add (
  siebel_id varchar2(32),
  siebel_account_id varchar2(32),
  cell_phone varchar2(30),
  assistant_phone varchar2(30),
  work_phone varchar2(30),
  address_name varchar2(100)
);

alter table DPS_CREDIT_CARD add (
  siebel_id varchar2(32),
  siebel_acct_pbp_id varchar2(32),
  siebel_address_id varchar2(32) 
);