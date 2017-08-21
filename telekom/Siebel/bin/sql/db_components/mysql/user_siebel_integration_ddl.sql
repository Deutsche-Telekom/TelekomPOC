alter table dps_user modify login varchar(40);

alter table dcs_org_address modify tag varchar(100);

alter table dps_user add (
  siebel_id varchar(32),
  siebel_account_id varchar(32)
);


alter table dps_organization add (
  siebel_id varchar(32),
  location varchar(80),
  phone_number varchar(30),
  default_carrier varchar(30)
);

alter table dps_contact_info add (
  siebel_id varchar(32),
  siebel_account_id varchar(32),
  cell_phone varchar(30),
  assistant_phone varchar(30),
  work_phone varchar(30),
  address_name varchar(100)
);

alter table dps_credit_card add (
  siebel_id varchar(32),
  siebel_acct_pbp_id varchar(32),
  siebel_address_id varchar(32) 
);

