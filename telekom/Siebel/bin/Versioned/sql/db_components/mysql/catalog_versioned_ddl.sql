-- Primary Tables

create table sbl_category_product
(
  asset_version					bigint			not null,
  workspace_id					varchar(40)		not null,
  branch_id						varchar(40)		not null,
  is_head						tinyint			not null,
  version_deleted				tinyint			not null,
  version_editable				tinyint			not null,
  pred_version					bigint			null,
  checkin_date					datetime		null,
  category_product_id			varchar(80)		not null,
  product		  		        varchar(80)		null,
  sequence_number				integer			null,
  active_flag					tinyint  		null
,constraint sbl_category_product_p primary key (category_product_id,asset_version)
);

create index sbl_category_product_wsx on sbl_category_product (workspace_id);
create index sbl_category_product_cix on sbl_category_product (checkin_date);

create table sbl_translation
(
  asset_version					bigint			not null,
  workspace_id					varchar(40)		not null,
  branch_id						varchar(40)		not null,
  is_head						tinyint			not null,
  version_deleted				tinyint			not null,
  version_editable				tinyint			not null,
  pred_version					bigint			null,
  checkin_date					datetime		null,
  translation_id				varchar(80)		not null,
  display_name					nvarchar(1024)	null,
  language_code					nvarchar(255)	null,
  language_name					nvarchar(255)	null
,constraint sbl_translation_p primary key (translation_id,asset_version)
);

create index sbl_translation_wsx on sbl_translation (workspace_id);
create index sbl_translation_cix on sbl_translation (checkin_date);

create table sbl_product_line
(
  asset_version					bigint			not null,
  workspace_id					varchar(40)		not null,
  branch_id						varchar(40)		not null,
  is_head						tinyint			not null,
  version_deleted				tinyint			not null,
  version_editable				tinyint			not null,
  pred_version					bigint			null,
  checkin_date					datetime		null,
  product_line_id				varchar(80)		not null,
  name							nvarchar(1024)	null,
  description					nvarchar(1024)	null
,constraint sbl_product_line_p primary key (product_line_id,asset_version)
);

create index sbl_product_line_wsx on sbl_product_line (workspace_id);
create index sbl_product_line_cix on sbl_product_line (checkin_date);

create table sbl_key_feature
(
  asset_version					bigint			not null,
  workspace_id					varchar(40)		not null,
  branch_id						varchar(40)		not null,
  is_head						tinyint			not null,
  version_deleted				tinyint			not null,
  version_editable				tinyint			not null,
  pred_version					bigint			null,
  checkin_date					datetime		null,
  key_feature_id				varchar(80)		not null,
  feature						nvarchar(255)	null,
  vendor_id						varchar(80)		null,
  vendor_location				nvarchar(1024)	null
,constraint sbl_key_feature_p primary key (key_feature_id,asset_version)
);

create index sbl_key_feature_wsx on sbl_key_feature (workspace_id);
create index sbl_key_feature_cix on sbl_key_feature (checkin_date);

create table sbl_literature
(
  asset_version					bigint			not null,
  workspace_id					varchar(40)		not null,
  branch_id						varchar(40)		not null,
  is_head						tinyint			not null,
  version_deleted				tinyint			not null,
  version_editable				tinyint			not null,
  pred_version					bigint			null,
  checkin_date					datetime		null,
  literature_id					varchar(80)		not null,
  description					nvarchar(1024)	null,
  literature_file_date			datetime		null,
  literature_file_ext			varchar(80)		null,
  literature_file_name			nvarchar(1024)	null,
  literature_file_size			integer			null,
  name							nvarchar(1024)	null,
  sales_tool_type				nvarchar(255)	null,
  release_date					datetime		null,
  expiration_date				datetime		null,
  web_display					nvarchar(1024)	null,
  synopsis						nvarchar(1024)	null
,constraint sbl_literature_p primary key (literature_id,asset_version)
);

create index sbl_literature_wsx on sbl_literature (workspace_id);
create index sbl_literature_cix on sbl_literature (checkin_date);

create table sbl_recommended_product
(
  asset_version					bigint			not null,
  workspace_id					varchar(40)		not null,
  branch_id						varchar(40)		not null,
  is_head						tinyint			not null,
  version_deleted				tinyint			not null,
  version_editable				tinyint			not null,
  pred_version					bigint			null,
  checkin_date					datetime		null,
  recommended_product_id		varchar(80)		not null,
  product						varchar(80)		null,
  type							nvarchar(255)	null,
  effective_from				datetime		null,
  effective_to					datetime		null
,constraint sbl_recommended_product_p primary key (recommended_product_id,asset_version)
);

create index sbl_recommended_product_wsx on sbl_recommended_product (workspace_id);
create index sbl_recommended_product_cix on sbl_recommended_product (checkin_date);

create table sbl_configured_attribute
(
  asset_version					bigint			not null,
  workspace_id					varchar(40)		not null,
  branch_id						varchar(40)		not null,
  is_head						tinyint			not null,
  version_deleted				tinyint			not null,
  version_editable				tinyint			not null,
  pred_version					bigint			null,
  checkin_date					datetime		null,
  configured_attribute_id		varchar(80)	not null,
  attribute_definition			varchar(80)		null,
  original_id					varchar(80)		null,
  attribute_name				nvarchar(255)	null,
  display_name					nvarchar(1024)	null,
  default_value					nvarchar(255)	null,
  increment_value				nvarchar(255)	null,
  maximum_value					nvarchar(255)	null,
  minimum_value					nvarchar(255)	null,
  none_value					nvarchar(255)	null,
  unit_of_measure				nvarchar(255)	null,
  hidden_flag					tinyint			null,
  read_only_flag				tinyint			null,
  required_flag					tinyint			null,
  vector_flag					tinyint			null  
,constraint sbl_configured_attribute_p primary key (configured_attribute_id,asset_version)
);

create index sbl_configured_attribute_wsx on sbl_configured_attribute (workspace_id);
create index sbl_configured_attribute_cix on sbl_configured_attribute (checkin_date);

create table sbl_attribute
(
  asset_version					bigint			not null,
  workspace_id					varchar(40)		not null,
  branch_id						varchar(40)		not null,
  is_head						tinyint			not null,
  version_deleted				tinyint			not null,
  version_editable				tinyint			not null,
  pred_version					bigint			null,
  checkin_date					datetime		null,
  attribute_id					varchar(80)		not null,
  original_id					varchar(80)		null,
  name							nvarchar(255)	null,
  description					nvarchar(1024)	null,
  domain_type					nvarchar(255)	null,
  data_type						nvarchar(255)	null,
  maximum_value					nvarchar(255)	null,
  minimum_value					nvarchar(255)	null,
  unit_of_measure				nvarchar(255)	null,
  attribute_definition_id		varchar(80)		null  
,constraint sbl_attribute_p primary key (attribute_id,asset_version)
);

create index sbl_attribute_wsx on sbl_attribute (workspace_id);
create index sbl_attribute_cix on sbl_attribute (checkin_date);

create table sbl_attribute_value
(
  asset_version					bigint			not null,
  workspace_id					varchar(40)		not null,
  branch_id						varchar(40)		not null,
  is_head						tinyint			not null,
  version_deleted				tinyint			not null,
  version_editable				tinyint			not null,
  pred_version					bigint			null,
  checkin_date					datetime		null,
  attribute_value_id			varchar(80)		not null,
  attribute_value				nvarchar(1024)	null,
  sequence						integer			null  
,constraint sbl_attribute_value_p primary key (attribute_value_id,asset_version)
);

create index sbl_attribute_value_wsx on sbl_attribute_value (workspace_id);
create index sbl_attribute_value_cix on sbl_attribute_value (checkin_date);

create table sbl_simple_bundle_structure
(
  asset_version					bigint			not null,
  workspace_id					varchar(40)		not null,
  branch_id						varchar(40)		not null,
  is_head						tinyint			not null,
  version_deleted				tinyint			not null,
  version_editable				tinyint			not null,
  pred_version					bigint			null,
  checkin_date					datetime		null,
  simple_bundle_struct_id		varchar(80)		not null
,constraint sbl_simple_bundle_structure_p primary key (simple_bundle_struct_id,asset_version)
);

create index sbl_simple_bundle_struct_wsx on sbl_simple_bundle_structure (workspace_id);
create index sbl_simple_bundle_struct_cix on sbl_simple_bundle_structure (checkin_date);

create table sbl_config_product_structure
(
  asset_version					bigint			not null,
  workspace_id					varchar(40)		not null,
  branch_id						varchar(40)		not null,
  is_head						tinyint			not null,
  version_deleted				tinyint			not null,
  version_editable				tinyint			not null,
  pred_version					bigint			null,
  checkin_date					datetime		null,
  config_prod_struct_id			varchar(80)		not null
,constraint sbl_config_product_structure_p primary key (config_prod_struct_id,asset_version)
);

create index sbl_config_product_struct_wsx on sbl_config_product_structure (workspace_id);
create index sbl_config_product_struct_cix on sbl_config_product_structure (checkin_date);

create table sbl_promotion_structure
(
  asset_version					bigint			not null,
  workspace_id					varchar(40)		not null,
  branch_id						varchar(40)		not null,
  is_head						tinyint			not null,
  version_deleted				tinyint			not null,
  version_editable				tinyint			not null,
  pred_version					bigint			null,
  checkin_date					datetime		null,
  promotion_struct_id			varchar(80)		not null,
  adjustment_charge				nvarchar(255)	null,
  adjustment_reason				nvarchar(1024)	null,
  charge_basis					nvarchar(1024)	null,
  commit_flag					tinyint			null,
  end_date						datetime		null,
  grace_period					integer			null,
  grace_period_uom				nvarchar(255)	null,
  instance						nvarchar(255)	null,
  nrc_amount					numeric(19,7)	null,
  nrc_currency_code				nvarchar(255)	null,
  nrc_exchange_date				datetime		null,
  nrc_plan_id					varchar(80)		null,
  nrc_plan_name					nvarchar(1024)	null,
  nrc_quantity					integer			null,
  nrc_schedule					nvarchar(255)	null,
  nrc_schedule_id				varchar(80)		null,
  period						integer			null,
  period_uom					nvarchar(255)	null,
  promotion						varchar(80)		null,
  promotion_type				nvarchar(255)	null,
  rc_adjustment_amount			numeric(19,7)	null,
  rc_adjustment_um				nvarchar(255)	null,
  rc_amount						numeric(19,7)	null,
  rc_amount_curr_code			nvarchar(255)	null,
  rc_amount_exch_date			datetime		null,
  rc_schedule					nvarchar(255)	null,
  rc_schedule_id				varchar(80)		null,
  reason						nvarchar(1024)	null,
  sales_product_flag			tinyint			null,
  score							integer			null,
  start_date					datetime		null,
  usage_plan_id					varchar(80)		null,
  usage_plan_name				nvarchar(1024)	null,
  usage_schedule				nvarchar(255)	null,
  usage_schedule_id				varchar(80)		null
,constraint sbl_promotion_structure_p primary key (promotion_struct_id,asset_version)
);

create index sbl_promotion_structure_wsx on sbl_promotion_structure (workspace_id);
create index sbl_promotion_structure_cix on sbl_promotion_structure (checkin_date);

create table sbl_relationship
(
  asset_version					bigint			not null,
  workspace_id					varchar(40)		not null,
  branch_id						varchar(40)		not null,
  is_head						tinyint			not null,
  version_deleted				tinyint			not null,
  version_editable				tinyint			not null,
  pred_version					bigint			null,
  checkin_date					datetime		null,
  relationship_id				varchar(80)		not null,
  name							nvarchar(1024)	null,
  display_name					nvarchar(1024)	null,
  class							varchar(80)		null,
  class_name					nvarchar(1024)	null,
  default_product				varchar(80)		null,
  minimum_cardinality			integer			null,
  maximum_cardinality			integer			null,
  default_cardinality			integer			null
,constraint sbl_relationship_p primary key (relationship_id,asset_version)
);

create index sbl_relationship_wsx on sbl_relationship (workspace_id);
create index sbl_relationship_cix on sbl_relationship (checkin_date);

create table sbl_relationship_domain
(
  asset_version					bigint			not null,
  workspace_id					varchar(40)		not null,
  branch_id						varchar(40)		not null,
  is_head						tinyint			not null,
  version_deleted				tinyint			not null,
  version_editable				tinyint			not null,
  pred_version					bigint			null,
  checkin_date					datetime		null,
  relationship_domain_id		varchar(80)		not null,
  product						varchar(80)		null,
  name							nvarchar(1024)	null,
  display_name					nvarchar(1024)	null,
  description					nvarchar(1024)	null
,constraint sbl_relationship_domain_p primary key (relationship_domain_id,asset_version)
);

create index sbl_relationship_domain_wsx on sbl_relationship_domain (workspace_id);
create index sbl_relationship_domain_cix on sbl_relationship_domain (checkin_date);

create table sbl_promotion_relationship
(
  asset_version					bigint			not null,
  workspace_id					varchar(40)		not null,
  branch_id						varchar(40)		not null,
  is_head						tinyint			not null,
  version_deleted				tinyint			not null,
  version_editable				tinyint			not null,
  pred_version					bigint			null,
  checkin_date					datetime		null,
  relationship_id				varchar(80)		not null,
  promotion						varchar(80)		null,
  product						varchar(80)		null,
  product_line					varchar(80)		null,
  class_name					nvarchar(1024)	null,
  class_version					nvarchar(255)	null,
  minimum_quantity				integer			null,
  maximum_quantity				integer			null,
  default_quantity				integer			null,
  type							nvarchar(255)	null,
  integration_id				varchar(80)		null
,constraint sbl_promotion_relationship_p primary key (relationship_id,asset_version)
);

create index sbl_promotion_rel_wsx on sbl_promotion_relationship (workspace_id);
create index sbl_promotion_rel_cix on sbl_promotion_relationship (checkin_date);

create table sbl_promo_prod_attr_override
(
  asset_version					bigint			not null,
  workspace_id					varchar(40)		not null,
  branch_id						varchar(40)		not null,
  is_head						tinyint			not null,
  version_deleted				tinyint			not null,
  version_editable				tinyint			not null,
  pred_version					bigint			null,
  checkin_date					datetime		null,
  promo_prod_attr_override_id	varchar(80)		not null,
  attribute_name				nvarchar(1024)	null,
  condition_clause				nvarchar(1024)	null,
  promotion_item_id				varchar(80)		null
,constraint sbl_promo_prod_attr_override_p primary key (promo_prod_attr_override_id,asset_version)
);

create index sbl_promo_prod_attr_over_wsx on sbl_promo_prod_attr_override (workspace_id);
create index sbl_promo_prod_attr_over_cix on sbl_promo_prod_attr_override (checkin_date);

create table sbl_promo_prod_attr_over_val
(
  asset_version					bigint			not null,
  workspace_id					varchar(40)		not null,
  branch_id						varchar(40)		not null,
  is_head						tinyint			not null,
  version_deleted				tinyint			not null,
  version_editable				tinyint			not null,
  pred_version					bigint			null,
  checkin_date					datetime		null,
  promo_prod_attr_over_val_id	varchar(80)		not null,
  promo_item_attr_id			varchar(80)		null,
  attribute_value				nvarchar(1024)	null
,constraint sbl_promo_prod_attr_over_val_p primary key (promo_prod_attr_over_val_id,asset_version)
);

create index sbl_pro_prod_attr_over_val_wsx on sbl_promo_prod_attr_over_val (workspace_id);
create index sbl_pro_prod_attr_over_val_cix on sbl_promo_prod_attr_over_val (checkin_date);

create table sbl_promo_prod_agg_defaults
(
  asset_version					bigint			not null,
  workspace_id					varchar(40)		not null,
  branch_id						varchar(40)		not null,
  is_head						tinyint			not null,
  version_deleted				tinyint			not null,
  version_editable				tinyint			not null,
  pred_version					bigint			null,
  checkin_date					datetime		null,
  promo_prod_agg_default_id		varchar(80)		not null,
  default_cardinality			integer			null,
  parent_class_id				varchar(80)		null,
  product						varchar(80)		null,
  type							nvarchar(255)	null
,constraint sbl_promo_prod_agg_defaults_p primary key (promo_prod_agg_default_id,asset_version)
);

create index sbl_promo_prod_agg_defs_wsx on sbl_promo_prod_agg_defaults (workspace_id);
create index sbl_promo_prod_agg_defs_cix on sbl_promo_prod_agg_defaults (checkin_date);

create table sbl_promo_pricing_rule
(
  asset_version					bigint			not null,
  workspace_id					varchar(40)		not null,
  branch_id						varchar(40)		not null,
  is_head						tinyint			not null,
  version_deleted				tinyint			not null,
  version_editable				tinyint			not null,
  pred_version					bigint			null,
  checkin_date					datetime		null,
  pricing_rule_id				varchar(80)		not null,
  matrix_rule_number			nvarchar(255)	null,
  adjustment_group_id			varchar(80)		null,
  adjustment_type				nvarchar(255)	null,
  adjustment_value				numeric(16,7)	null,
  class_name					nvarchar(1024)	null,
  class_version					varchar(80)		null,
  product						varchar(80)		null,
  product_line					varchar(80)		null,
  promotion						varchar(80)		null,
  type							nvarchar(255)	null,
  currency_code					nvarchar(255)	null,
  exchange_date					datetime		null
,constraint sbl_promo_pricing_rule_p primary key (pricing_rule_id,asset_version)
);

create index sbl_promo_pricing_rule_wsx on sbl_promo_pricing_rule (workspace_id);
create index sbl_promo_pricing_rule_cix on sbl_promo_pricing_rule (checkin_date);

create table sbl_promotion_term
(
  asset_version					bigint			not null,
  workspace_id					varchar(40)		not null,
  branch_id						varchar(40)		not null,
  is_head						tinyint			not null,
  version_deleted				tinyint			not null,
  version_editable				tinyint			not null,
  pred_version					bigint			null,
  checkin_date					datetime		null,
  term_id						varchar(80)		not null,
  description					nvarchar(1024)	null,
  name							nvarchar(1024)	null,
  section						nvarchar(255)	null,
  sequence_number				integer			null,
  term_template_id				varchar(80)		null,
  type							nvarchar(255)	null
,constraint sbl_promotion_term_p primary key (term_id,asset_version)
);

create index sbl_promotion_term_wsx on sbl_promotion_term (workspace_id);
create index sbl_promotion_term_cix on sbl_promotion_term (checkin_date);

create table sbl_promotion_upgrade
(
  asset_version					bigint			not null,
  workspace_id					varchar(40)		not null,
  branch_id						varchar(40)		not null,
  is_head						tinyint			not null,
  version_deleted				tinyint			not null,
  version_editable				tinyint			not null,
  pred_version					bigint			null,
  checkin_date					datetime		null,
  upgrade_id					varchar(80)		not null,
  original_promotion			varchar(80)		null,
  target_promotion				varchar(80)		null,
  commitment_start				nvarchar(255)	null,
  duration						nvarchar(255)	null,
  penalty_amount				numeric(16,7)	null,
  penalty_amount_curr_code		nvarchar(255)	null,
  penalty_amount_exch_date		datetime		null,
  prorate_plan_id				varchar(80)		null,
  prorate_plan_name				nvarchar(1024)	null,
  relationship_type				nvarchar(255)	null
,constraint sbl_promotion_upgrade_p primary key (upgrade_id,asset_version)
);

create index sbl_promotion_upgrade_wsx on sbl_promotion_upgrade (workspace_id);
create index sbl_promotion_upgrade_cix on sbl_promotion_upgrade (checkin_date);

create table sbl_promotion_version
(
  asset_version					bigint			not null,
  workspace_id					varchar(40)		not null,
  branch_id						varchar(40)		not null,
  is_head						tinyint			not null,
  version_deleted				tinyint			not null,
  version_editable				tinyint			not null,
  pred_version					bigint			null,
  checkin_date					datetime		null,
  version_id					varchar(80)		not null,
  created						datetime		null,
  active_flag					tinyint			null,
  promotion_end_date			datetime		null,
  promotion						varchar(80)		null,
  promotion_object_id			varchar(80)		null,
  released_flag					tinyint			null,
  promotion_start_date			datetime		null,
  version						nvarchar(255)	null
,constraint sbl_promotion_version_p primary key (version_id,asset_version)
);

create index sbl_promotion_version_wsx on sbl_promotion_version (workspace_id);
create index sbl_promotion_version_cix on sbl_promotion_version (checkin_date);

create table sbl_product_class
(
  asset_version					bigint			not null,
  workspace_id					varchar(40)		not null,
  branch_id						varchar(40)		not null,
  is_head						tinyint			not null,
  version_deleted				tinyint			not null,
  version_editable				tinyint			not null,
  pred_version					bigint			null,
  checkin_date					datetime		null,
  class_id						varchar(80)		not null,
  name							nvarchar(1024)	null,
  parent_class_id				varchar(80)		null,
  parent_class_name				nvarchar(1024)	null
,constraint sbl_product_class_p primary key (class_id,asset_version)
);

create index sbl_product_class_wsx on sbl_product_class (workspace_id);
create index sbl_product_class_cix on sbl_product_class (checkin_date);

-- Auxilary Tables

create table sbl_catalog
(
  asset_version					bigint			not null,
  catalog_id					varchar(80)		not null,
  active    					tinyint			null,
  catalog_type					nvarchar(255)	null,
  description					nvarchar(1024)	null,
  start_date					datetime		null,
  end_date						datetime		null,
  private_flag 					tinyint			null,
  sequence_number				integer			null
,constraint sbl_catalog_p primary key (catalog_id,asset_version)
);

create table sbl_catalog_media
(
  asset_version					bigint			not null,
  catalog_id					varchar(80)		not null,
  thumbnail_image_id			varchar(80)		null
,constraint sbl_catalog_media_p primary key (catalog_id,asset_version)
);

create table sbl_category
(
  asset_version					bigint			not null,
  category_id					varchar(80)		not null,
  active_flag   				tinyint			null,
  count							integer			null,
  private_flag   				tinyint			null,
  root_category_flag   			tinyint			null,
  sequence_number				integer			null,
  category_usage				nvarchar(1024)	null,
  parent_category_id			varchar(80) 	null  
,constraint sbl_category_p primary key (category_id,asset_version)
);

create table sbl_product
(
  asset_version					bigint			not null,
  product_id					varchar(80)		not null,
  siebel_type					integer			not null,
  quantity   					integer			null,
  product_cfg_model_id			varchar(80)		null,
  inclusive_eligibility_flag	tinyint			null,
  integration_id				varchar(80)		null,
  orderable						tinyint			null,
  part							nvarchar(1024)	null,
  price_list_id					varchar(80)		null,
  product_def_type_code			integer			null,
  product_type_code				integer			null,
  unit_of_measure				nvarchar(255)	null,
  vendor_integration_id			varchar(80)		null,
  class							varchar(80)		null,
  price_type					integer			null,
  active						tinyint			null,
  simple_bundle_struct_id		varchar(80)		null,
  config_prod_struct_id			varchar(80)		null,
  promotion_struct_id			varchar(80)		null
,constraint sbl_product_p primary key (product_id,asset_version)
);

create table sbl_media_external
(
  asset_version					bigint			not null,
  media_id						varchar(80)		not null,
  media_size	   				integer			null
,constraint sbl_media_external_p primary key (media_id,asset_version)
);

create table sbl_promotion_struct_media
(
  asset_version					bigint			not null,
  promotion_struct_id			varchar(80)		not null,
  large_image_id	   			varchar(80)		null,
  thumbnail_image_id	   		varchar(80)		null
,constraint sbl_promotion_struct_media_p primary key (promotion_struct_id,asset_version)
);

-- Multi Tables

create table sbl_catalog_translation
(
  asset_version					bigint			not null,
  catalog_id					varchar(80)		not null,
  translation_id				varchar(80)		not null
,constraint sbl_catalog_translation_p primary key (catalog_id,translation_id,asset_version)
);

create table sbl_category_translation
(
  asset_version					bigint			not null,
  category_id					varchar(80)		not null,
  translation_id				varchar(80)		not null
,constraint sbl_category_translation_p primary key (category_id,translation_id,asset_version)
);

create table sbl_category_products
(
  asset_version					bigint			not null,
  category_id					varchar(80)		not null,
  category_product_id			varchar(80)		not null
,constraint sbl_category_products_p primary key (category_id,category_product_id,asset_version)
);

create table sbl_product_translation
(
  asset_version					bigint			not null,
  product_id					varchar(80)		not null,
  translation_id				varchar(80)		not null
,constraint sbl_product_translation_p primary key (product_id,translation_id,asset_version)
);

create table sbl_prod_product_line
(
  asset_version					bigint			not null,
  product_id					varchar(80)		not null,
  product_line_id				varchar(80)		not null
,constraint sbl_prod_product_line_p primary key (product_id,product_line_id,asset_version)
);

create table sbl_product_feature
(
  asset_version					bigint			not null,
  product_id					varchar(80)		not null,
  key_feature_id				varchar(80)		not null
,constraint sbl_product_feature_p primary key (product_id,key_feature_id,asset_version)
);

create table sbl_product_literature
(
  asset_version					bigint			not null,
  product_id					varchar(80)		not null,
  literature_id					varchar(80)		not null
,constraint sbl_product_literature_p primary key (product_id,literature_id,asset_version)
);

create table sbl_product_rec_prod
(
  asset_version					bigint			not null,
  product_id					varchar(80)		not null,
  recommended_product_id		varchar(80)		not null
,constraint sbl_product_rec_prod_p primary key (product_id,recommended_product_id,asset_version)
);

create table sbl_product_config_attr
(
  asset_version					bigint			not null,
  product_id					varchar(80)		not null,
  configured_attribute_id		varchar(80)		not null
,constraint sbl_product_config_attr_p primary key (product_id,configured_attribute_id,asset_version)
);

create table sbl_attribute_translation
(
  asset_version					bigint			not null,
  attribute_id					varchar(80)		not null,
  translation_id				varchar(80)		not null
,constraint sbl_attribute_translation_p primary key (attribute_id,translation_id,asset_version)
);

create table sbl_attr_attr_value
(
  asset_version					bigint			not null,
  attribute_id					varchar(80)	not null,
  attribute_value_id			varchar(80)		not null
,constraint sbl_attr_attr_value_p primary key (attribute_id,attribute_value_id,asset_version)
);

create table sbl_attr_val_translation
(
  asset_version					bigint			not null,
  attribute_value_id			varchar(80)		not null,
  translation_id				varchar(80)		not null
,constraint sbl_attr_val_translation_p primary key (attribute_value_id,translation_id,asset_version)
);

create table sbl_simple_bundle_struct_rel
(
  asset_version					bigint			not null,
  simple_bundle_struct_id		varchar(80)		not null,
  relationship_id				varchar(80)		not null
,constraint sbl_simple_bun_struct_rel_p primary key (simple_bundle_struct_id,relationship_id,asset_version)
);

create table sbl_config_prod_media
(
  asset_version					bigint			not null,
  config_prod_struct_id			varchar(80)		not null,
  decoration_id	   				varchar(80)		null
,constraint sbl_config_prod_media_p primary key (config_prod_struct_id,decoration_id,asset_version)
);

create table sbl_config_prod_struct_rel
(
  asset_version					bigint			not null,
  config_prod_struct_id			varchar(80)		not null,
  relationship_id				varchar(80)		not null
,constraint sbl_config_prod_struct_rel_p primary key (config_prod_struct_id,relationship_id,asset_version)
);

create table sbl_promotion_struct_rel
(
  asset_version					bigint			not null,
  promotion_struct_id			varchar(80)		not null,
  relationship_id				varchar(80)		not null
,constraint sbl_promotion_struct_rel_p primary key (promotion_struct_id,relationship_id,asset_version)
);

create table sbl_promo_struct_pricing_rule
(
  asset_version					bigint			not null,
  promotion_struct_id			varchar(80)		not null,
  promotion_pricing_rule_id		varchar(80)		not null
,constraint sbl_promo_struct_pri_rule_p primary key (promotion_struct_id,promotion_pricing_rule_id,asset_version)
);

create table sbl_promotion_struct_msg
(
  asset_version					bigint			not null,
  promotion_struct_id			varchar(80)		not null,
  translation_id				varchar(80)		not null
,constraint sbl_promotion_struct_msg_p primary key (promotion_struct_id,translation_id,asset_version)
);

create table sbl_promotion_struct_term
(
  asset_version					bigint			not null,
  promotion_struct_id			varchar(80)		not null,
  term_id						varchar(80)		not null
,constraint sbl_promotion_struct_term_p primary key (promotion_struct_id,term_id,asset_version)
);

create table sbl_promotion_struct_upgrade
(
  asset_version					bigint			not null,
  promotion_struct_id			varchar(80)		not null,
  upgrade_id					varchar(80)		not null
,constraint sbl_promo_struct_upgrade_p primary key (promotion_struct_id,upgrade_id,asset_version)
);

create table sbl_promotion_struct_version
(
  asset_version					bigint			not null,
  promotion_struct_id			varchar(80)		not null,
  version_id					varchar(80)		not null
,constraint sbl_promo_struct_version_p primary key (promotion_struct_id,version_id,asset_version)
);

create table sbl_relationship_translation
(
  asset_version					bigint			not null,
  relationship_id				varchar(80)		not null,
  translation_id				varchar(80)		not null
,constraint sbl_rel_translation_p primary key (relationship_id,translation_id,asset_version)
);

create table sbl_relationship_domains
(
  asset_version					bigint			not null,
  relationship_id				varchar(80)		not null,
  relationship_domain_id		varchar(80)		not null
,constraint sbl_relationship_domains_p primary key (relationship_id,relationship_domain_id,asset_version)
);

create table sbl_relationship_media
(
  asset_version					bigint			not null,
  relationship_id				varchar(80)		not null,
  relationship_decoration_id	varchar(80)		not null
,constraint sbl_relationship_media_p primary key (relationship_id,relationship_decoration_id,asset_version)
);

create table sbl_promo_rel_attr_overrides
(
  asset_version					bigint			not null,
  relationship_id				varchar(80)		not null,
  promo_prod_attr_override_id	varchar(80)		not null
,constraint sbl_promo_rel_attr_over_p primary key (relationship_id,promo_prod_attr_override_id,asset_version)
);

create table sbl_promo_rel_prod_msg
(
  asset_version					bigint			not null,
  relationship_id				varchar(80)		not null,
  translation_id				varchar(80)		not null
,constraint sbl_promo_rel_prod_msg_p primary key (relationship_id,translation_id,asset_version)
);

create table sbl_promo_rel_agg_def_prod
(
  asset_version					bigint			not null,
  relationship_id				varchar(80)		not null,
  promo_prod_agg_default_id		varchar(80)		not null
,constraint sbl_promo_rel_agg_def_prod_p primary key (relationship_id,promo_prod_agg_default_id,asset_version)
);

create table sbl_prod_attr_override_values
(
  asset_version					bigint			not null,
  promo_prod_attr_override_id	varchar(80)		not null,
  promo_prod_attr_over_val_id	varchar(80)		not null
,constraint sbl_prod_attr_over_values_p primary key (promo_prod_attr_override_id,promo_prod_attr_over_val_id,asset_version)
);

create table sbl_prod_class_translation
(
  asset_version					bigint			not null,
  class_id							varchar(80)	not null,
  translation_id					varchar(80)	not null
,constraint sbl_prod_class_translation_p primary key (class_id,translation_id,asset_version)
);

create table sbl_prod_class_conf_attr
(
  asset_version					bigint			not null,
  class_id							varchar(80)	not null,
  configured_attribute_id			varchar(80)	not null
,constraint sbl_prod_class_conf_attr_p primary key (class_id,configured_attribute_id,asset_version)
);
